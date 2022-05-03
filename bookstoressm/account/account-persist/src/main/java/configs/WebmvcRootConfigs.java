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
 * ��Щע���ر���Ҫ��������ע�����
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
		System.err.println("װ��imp!!!!!!!!!!!!!!!!!!");
		return new StudentServiceImp(dao);
	}*/
	//QA����Դ
			@Bean
			public BasicDataSource qaDS() {
				BasicDataSource bds=new BasicDataSource();
				bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
				bds.setUrl(//Ҫ��jdabTemplate����
						"jdbc:mysql://localhost:3306/mybatis?rewriteBatchedStatements=true");
				bds.setUsername("root");
				bds.setPassword("cys2022!");
				bds.setMaxActive(10);
				System.err.println("����DataSource��ɣ���������");
				return bds;
			}
			/*��������Դ
			@Bean
			@Conditional(ConditionalJndi.class)
			public JndiObjectFactoryBean jndiDS() {
				JndiObjectFactoryBean jndi=new JndiObjectFactoryBean();
				jndi.setJndiName("jdbc/���ݿ�����");
				jndi.setResourceRef(true);
				jndi.setProxyInterface(javax.sql.DataSource.class);
				return jndi;
			}
			//��������Դ
			@Bean
			@Conditional(ConditionalInitia.class)
			public DataSource initiaDS() {
				System.err.println("����DataSource");
				return new EmbeddedDatabaseBuilder()
						.setType(EmbeddedDatabaseType.H2)
						.addScript("classpath:schema.sql")
						.addScript("classpath:test-data.sql")
						.build();
			}*/
		/**/@Bean
		public SqlSessionTemplate sst(SqlSessionFactory ssfb) {
			SqlSessionTemplate sst=new SqlSessionTemplate(ssfb);
			System.err.println("����sstemplate��ɣ�����������"+(sst!=null));
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
	//	��������� ��mybatis�������ݿ�������ƣ�springʹ��jdbc�����������
		@Bean(name = "transactionManager")
		public DataSourceTransactionManager dataSourceTransactionManager(DataSource ds) {
			DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
			dataSourceTransactionManager.setDataSource(ds);
			System.err.println("����Spring���������ɣ�����������"+(ds!=null));
			return dataSourceTransactionManager;
		}
	 //��֪���������
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
			System.err.println("����������������ɣ�����������");
			return interceptor;
		}
}
