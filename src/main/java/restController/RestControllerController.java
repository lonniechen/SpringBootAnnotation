package restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerController {
	
	@Autowired
	RestControllerBean bean;

	@RequestMapping("/bean")
	private RestControllerBean getBean() {
		return bean;
	}

}
