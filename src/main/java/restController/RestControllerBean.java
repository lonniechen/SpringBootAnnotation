package restController;

import org.springframework.stereotype.Component;

@Component
public class RestControllerBean {

	private String name = "RestControllerBean";
	private String type = "Response";
	private String status = "Success";

//	public String getName() {
//		return name;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}

//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}

}
