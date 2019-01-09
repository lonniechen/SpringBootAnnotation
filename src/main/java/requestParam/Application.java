package requestParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {

//	Run the application and input "localhost:8080/bean" in the browser
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
