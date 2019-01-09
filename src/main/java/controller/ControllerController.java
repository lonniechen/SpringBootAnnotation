package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerController {

//	@RequestMapping helps the controller to capture requests with certain features
	@RequestMapping("/valid")
//	@ResponseBody helps the controller to generate response
	@ResponseBody
	String showValidPage() {
		return "This is a valid page";
	}

	@RequestMapping("/invalid")
	String showInvalidPage() {
		return "This page is invalid";
	}

}
