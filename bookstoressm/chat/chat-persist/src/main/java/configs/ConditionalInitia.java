package configs;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionalInitia implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.err.println("conditional");
		//获取全局环境，包含DispatcherServlet,SContext,环境变量，JVM系统属性，等
		Environment env=context.getEnvironment();
		//然后检查，如果环境包含了自定义的属性(环境阶段的标志)，那么返回true
		return env.getProperty("envFlag").equals("initia");
	}

}
