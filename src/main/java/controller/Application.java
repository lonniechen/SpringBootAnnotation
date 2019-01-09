package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
//here we don't use AnnotationConfigApplicationContext; SpringBoot guess the purpose of the project and use ServletWebServerApplicationContext instead
//so @ComponentScan should be moved here to help create the context, which tell Spring to manage the beans 
@ComponentScan
public class Application {

//	Run the application and input "localhost:8080/valid" and "localhost:8080/invalid" in the browser
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}
