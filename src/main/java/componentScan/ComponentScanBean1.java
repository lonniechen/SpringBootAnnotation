package componentScan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ComponentScanBean1 {
	private String message = "Bean name is componentScanBean1, Class is ComponentScanBean1.class";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
