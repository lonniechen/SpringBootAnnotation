package resource;

import org.springframework.stereotype.Component;

@Component(value = "rb4")
public class ResourceBean4 {
	public String getMessage() {
		return "this is ResourceBean4";
	}
}
