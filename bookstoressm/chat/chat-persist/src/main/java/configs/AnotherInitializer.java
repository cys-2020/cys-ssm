package configs;

import javax.servlet.ServletRegistration.Dynamic;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class AnotherInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) 
			throws ServletException {/*
		//手动注册Servlet，以前是写在web.xml里的
		Dynamic servlet1=servletContext.addServlet(
				"servlet1name", servlet1.class);
		servlet1.addMapping("servlet1的url");
		//手动注册Filter
		javax.servlet.FilterRegistration.Dynamic filter1=
				servletContext.addFilter("filter1name", filter1.class);
		filter1.addMappingForUrlPatterns(null, false, "需要filter的url");*/
	}

}
