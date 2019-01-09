package exceptionHandler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NonExceptionController {

	@RequestMapping(value = "/negative")
	public int multiply(@RequestParam(value = "input") int x) {
		return -x;
	}

}
