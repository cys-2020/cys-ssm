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
		return new Class<?>[] {WebmvcConfigs.class};//ָ�������࣬��webmvc������Bean(con,view)
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};//ӳ�䵽DispatcherServlet�ϵ�·��
												//Ҳ����DS��Ҫ���������·��
	}
	
	@Override//��ע��DispatcherServlet֮����ã�Context���������ȵȶ�����������
	protected void customizeRegistration(Dynamic registration) {
	//registration.setInitParameter(arg0, arg1)
		//registration.setLoadOnStartup(1);
		registration.setMultipartConfig(//�����ϴ��ļ�������
				new MultipartConfigElement("/tmp/springmvc/uploads",
						2048*1024,4096*1024,0));//�ϴ��ļ���С�������С��ֱ�ӷŵ�����
		
	}
	
}
