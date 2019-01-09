package enableAutoConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author Lang
 *
 *	SpringApplication.run() needs to create an appropriate ApplicationContext; as there is a dependency of spring-boot-starter-web in the pom.xml, Spring guesses that a ServletWebServerApplicationContext is needed
 *	@EnableAutoConfiguration enables Spring to register a ServletWebServerFactory bean to create this ApplicationContext
 *	If this annotation is deleted, then another ServletWebServerFactory bean should be registered
 *	Otherwise, error "Unable to start ServletWebServerApplicationContext due to missing ServletWebServerFactory bean" will arise
 */

@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
