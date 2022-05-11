package configs;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class WebappInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {WebmvcRootConfigs.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebmvcConfigs.class};//指定配置类，含webmvc的配置Bean(con,view)
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};//映射到DispatcherServlet上的路径
												//也就是DS需要处理的请求路径
	}
	
	@Override//在注册DispatcherServlet之后调用，Context环境参数等等都在这里设置
	protected void customizeRegistration(Dynamic registration) {
	//registration.setInitParameter(arg0, arg1)
		//registration.setLoadOnStartup(1);
		registration.setMultipartConfig(//关于上传文件的设置
				new MultipartConfigElement("/tmp/springmvc/uploads",
						2048*1024,4096*1024,0));//上传文件大小，请求大小，直接放到磁盘
		
	}
	
}
