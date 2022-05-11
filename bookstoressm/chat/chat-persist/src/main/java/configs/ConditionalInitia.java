package configs;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionalInitia implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.err.println("conditional");
		//��ȡȫ�ֻ���������DispatcherServlet,SContext,����������JVMϵͳ���ԣ���
		Environment env=context.getEnvironment();
		//Ȼ���飬��������������Զ��������(�����׶εı�־)����ô����true
		return env.getProperty("envFlag").equals("initia");
	}

}
