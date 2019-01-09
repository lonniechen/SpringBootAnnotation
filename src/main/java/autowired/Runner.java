package autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfig.class);
		NormalBean normalBean = (NormalBean) context.getBean("normalBean");

		System.out.println(normalBean.theFirstAutowiredBean.getMessage());
		System.out.println(normalBean.autowiredBean3.getMessage());
		System.out.println(normalBean.autowiredBean4.getMessage());
		System.out.println(normalBean.anonymousBean1.getMessage());
		System.out.println(normalBean.anonymousBean2.getMessage());
	}

}
