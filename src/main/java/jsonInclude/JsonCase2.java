package jsonInclude;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = { "JsonCase1", "Location", "Title" })
public class JsonCase2 {

	@JsonProperty("Title")
	private String title;

	@JsonProperty("JsonCase1")
	private JsonCase1 jc1;

	@JsonProperty("Location")
	private String location;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public JsonCase1 getJc1() {
		return jc1;
	}

	public void setJc1(JsonCase1 jc1) {
		this.jc1 = jc1;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
