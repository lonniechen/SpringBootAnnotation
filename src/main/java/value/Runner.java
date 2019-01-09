package value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValueConfig.class);
		ValueBean valueBean = context.getBean(ValueBean.class);
		valueBean.outputResource();
	}

}
