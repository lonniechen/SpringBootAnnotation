package configurationProperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationPropertiesConfig.class);
		ConfigurationPropertiesBean bean = (ConfigurationPropertiesBean) context.getBean(ConfigurationPropertiesBean.class);
		System.out.println(bean.toString());
	}

}
