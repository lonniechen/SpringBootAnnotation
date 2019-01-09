package componentScan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "csb2")
@Scope("prototype")
public class ComponentScanBean2 {
	public String message = "Bean name is csb2, Class is ComponentScanBean2.class";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
