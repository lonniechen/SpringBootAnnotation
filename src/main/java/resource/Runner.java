package resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
		NormalBean normalBean = (NormalBean) context.getBean("normalBean");

		System.out.println(normalBean.resourceBean1.getMessage());
		System.out.println(normalBean.beanByType.getMessage());
		System.out.println(normalBean.thirdRB.getMessage());
		System.out.println(normalBean.fourthRB.getMessage());
		System.out.println(normalBean.fifthRB.getMessage());

	}
}
