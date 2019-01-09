package configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationConfig.class);

		String string1 = (String) context.getBean("configurationBean");
		System.out.println(string1);

//		this will report error
//		although defined in class "InvalidConfigurationBean", the bean is not registered as it is not detected by @Configuration
//		Spring won't manage the unmanaged bean
//		String string2 = (String) context.getBean("invalidConfigurationBean");
		
//		look into the messageBean class in bean package, comment out the @Component to see what will happen
		String string2 = (String) context.getBean("messageBean1");
		System.out.println(string2);
		
		String string3 = (String) context.getBean("mb2");
		System.out.println(string3);
		
		String string4 = (String) context.getBean("mb3");
		System.out.println(string4);
	}

}
