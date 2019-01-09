package configuration;

import org.springframework.context.annotation.Bean;

public class InvalidConfigurationBean {
	
	@Bean
	public String invalidConfigurationBean() {
		return "This bean will not be injected into Spring.";
	}
}
