package configs;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionalJndi implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		System.err.println(context.getEnvironment().getProperty("datasource")==null);
		return context.getEnvironment().getProperty("datasource").equals("jndi");
	}

}
