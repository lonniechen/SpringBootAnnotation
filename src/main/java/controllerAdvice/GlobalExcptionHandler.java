package controllerAdvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExcptionHandler {

	@ExceptionHandler(NumberFormatException.class)
	@ResponseBody
	public String handleNumberFormationException(NumberFormatException e) {
		return "invalid input " + e.getMessage();
	}
}
