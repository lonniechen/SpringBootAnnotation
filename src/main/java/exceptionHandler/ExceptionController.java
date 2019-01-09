package exceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
	
	@RequestMapping(value="/double")
	public int multiply(@RequestParam(value="input") int x) {
		return x*2;
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public String handleNumberFormationException(NumberFormatException e) {
		return "invalid input " + e.getMessage();
	}
	
	
}
