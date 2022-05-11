package configs;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionalQa implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO �Զ����ɵķ������
		return context.getEnvironment().getProperty("datasource").equals("qa");
	}

}
