package componentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import component.ComponentBean;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

//		the default bean name of a Component is the class name with lower case initiate
//		the beans can be accessed by bean name, class type, or some other method
		ComponentScanBean1 bean1 = (ComponentScanBean1) context.getBean("componentScanBean1");
		System.out.println("bean1 : " + bean1.getMessage());
		ComponentScanBean1 bean2 = (ComponentScanBean1) context.getBean(ComponentScanBean1.class);
		System.out.println("bean2 : " + bean2.getMessage());

//		this line will return error since the bean name "componentScanBean2" doesn't exist; the correct bean name is "csb2"
//		ComponentScanBean2 bean3 = (ComponentScanBean2) context.getBean("componentScanBean2");
		ComponentScanBean2 bean3 = (ComponentScanBean2) context.getBean("csb2");
		System.out.println("bean3 : " + bean3.getMessage());
		ComponentScanBean2 bean4 = (ComponentScanBean2) context.getBean(ComponentScanBean2.class);
		System.out.println("bean4 : " + bean4.getMessage());

//		@Scope determine how Spring instantiates the instance of a bean
//		the default is singleton
//		other options are request/session etc
		if (bean1.equals(bean2)) {
			System.out.println("@Scope of singleton create only one instance within the bean.");
		} else {

		}

		if (bean3.equals(bean4)) {

		} else {
			System.out.println("@Scope of prototype create different instances everytime the bean is used.");
		}

//		the components from other package can also be used, as long as their packages were scanned by @ComponentScan in @Configuration 
		ComponentBean bean5 = (ComponentBean) context.getBean(ComponentBean.class);
		System.out.println("bean5 : " + bean5.getMessage());

	}
}
