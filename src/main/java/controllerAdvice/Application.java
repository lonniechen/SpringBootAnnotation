package controllerAdvice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {

//	input "localhost:8080/double?input=XXX" and "localhost:8080/negative?input=XXX"
//	where XXX is integer, or random string like "asdadaf"		
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}
