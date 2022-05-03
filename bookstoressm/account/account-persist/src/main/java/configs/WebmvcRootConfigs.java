package configs;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import dao.UserDAO;
import service.UserServiceImp;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
/*
 * 这些注解特别重要！！！！注意包名
 */
@EnableTransactionManagement
@Configuration
@MapperScan(basePackageClasses=UserDAO.class)
@ComponentScan(basePackageClasses=UserServiceImp.class,
	excludeFilters= {
		@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})
public class WebmvcRootConfigs {
	/*@Bean
	public StudentServiceImp imp(StudentDAO dao) {
		System.err.println("装配imp!!!!!!!!!!!!!!!!!!");
		return new StudentServiceImp(dao);
	}*/
	//QA数据源
			@Bean
			public BasicDataSource qaDS() {
				BasicDataSource bds=new BasicDataSource();
				bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
				bds.setUrl(//要用jdabTemplate才行
						"jdbc:mysql://localhost:3306/mybatis?rewriteBatchedStatements=true");
				bds.setUsername("root");
				bds.setPassword("cys2022!");
				bds.setMaxActive(10);
				System.err.println("配置DataSource完成！！！！！");
				return bds;
			}
			/*最终数据源
			@Bean
			@Conditional(ConditionalJndi.class)
			public JndiObjectFactoryBean jndiDS() {
				JndiObjectFactoryBean jndi=new JndiObjectFactoryBean();
				jndi.setJndiName("jdbc/数据库名称");
				jndi.setResourceRef(true);
				jndi.setProxyInterface(javax.sql.DataSource.class);
				return jndi;
			}
			//开发数据源
			@Bean
			@Conditional(ConditionalInitia.class)
			public DataSource initiaDS() {
				System.err.println("配置DataSource");
				return new EmbeddedDatabaseBuilder()
						.setType(EmbeddedDatabaseType.H2)
						.addScript("classpath:schema.sql")
						.addScript("classpath:test-data.sql")
						.build();
			}*/
		/**/@Bean
		public SqlSessionTemplate sst(SqlSessionFactory ssfb) {
			SqlSessionTemplate sst=new SqlSessionTemplate(ssfb);
			System.err.println("配置sstemplate完成？？？？？？"+(sst!=null));
			return sst;
		}
		@Bean
		public SqlSessionFactoryBean ssfb(DataSource ds) throws IOException {
			
			SqlSessionFactoryBean s=new SqlSessionFactoryBean();
			s.setDataSource(ds);
			s.setConfigLocation(new PathMatchingResourcePatternResolver()
					.getResource("mybatis/mybatis_config.xml"));
			return s;
		}
	//	事务管理器 对mybatis操作数据库事务控制，spring使用jdbc的事务控制类
		@Bean(name = "transactionManager")
		public DataSourceTransactionManager dataSourceTransactionManager(DataSource ds) {
			DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
			dataSourceTransactionManager.setDataSource(ds);
			System.err.println("配置Spring事务管理完成？？？？？？"+(ds!=null));
			return dataSourceTransactionManager;
		}
	 //不知道这个东西
		@Bean(name = "transactionInterceptor")
		public TransactionInterceptor interceptor(DataSourceTransactionManager dstm) {
			TransactionInterceptor interceptor = new TransactionInterceptor();
			interceptor.setTransactionManager(dstm);
			Properties transactionAttributes = new Properties();
			transactionAttributes.setProperty("save*", "PROPAGATION_REQUIRED");
			transactionAttributes.setProperty("del*", "PROPAGATION_REQUIRED");
			transactionAttributes.setProperty("update*", "PROPAGATION_REQUIRED");
			transactionAttributes.setProperty("get*", "PROPAGATION_REQUIRED,readOnly");
			transactionAttributes.setProperty("find*", "PROPAGATION_REQUIRED,readOnly");
			transactionAttributes.setProperty("*", "PROPAGATION_REQUIRED");
			interceptor.setTransactionAttributes(transactionAttributes);
			System.err.println("配置事务拦截器完成！！！！！！");
			return interceptor;
		}
}
