package component;

import org.springframework.stereotype.Component;

@Component
public class ComponentBean {
	private String message = "this is the ComponentBean";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
