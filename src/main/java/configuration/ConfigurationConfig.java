package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "bean" })
public class ConfigurationConfig {

//	this method define a bean with name "configurationBean" and type "String"
//	the bean will be registered into Spring since it is directly under @Configuration
	@Bean
	public String configurationBean() {
		return "This bean will be injected into Spring as it's in the class under @Configuration.";
	}
}
