package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessageBean {
	
	@Bean
	private String messageBean1() {
		return "this is the message from messageBean1. Default bean name is the function name";
	}
	
	@Bean(name="mb2")
	private String messageBean2() {
		return "this is the message from messageBean2. Bean name can be defined with name = {name}";
	}
	
	@Bean("mb3")
	private String messageBean3() {
		return "this is the message from messageBean3. Bean name can also be define implicitly";
	}
	
}
