package autowired;

import org.springframework.stereotype.Component;

@Component
public class AutowiredBean3 implements AutowiredBean {

	@Override
	public String getMessage() {
		return "this is AutowiredBean3";
	}

}
