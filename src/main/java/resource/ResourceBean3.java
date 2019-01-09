package resource;

import org.springframework.stereotype.Component;

@Component(value = "rb3")
public class ResourceBean3 {
	public String getMessage() {
		return "this is ResourceBean3";
	}
}
