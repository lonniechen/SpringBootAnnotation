package resource;

import org.springframework.stereotype.Component;

@Component(value = "rb5")
public class ResourceBean5 {
	public String getMessage() {
		return "this is ResourceBean5";
	}
}
