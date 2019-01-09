package autowired;

import org.springframework.stereotype.Component;

@Component
public class AutowiredBean4 implements AutowiredBean {

	@Override
	public String getMessage() {
		return "this is AutowiredBean4";
	}

}
