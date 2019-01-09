package configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("configurationProperties.properties")  //directory: src/main/resources
@ConfigurationProperties(prefix = "people")
public class ConfigurationPropertiesBean {

	private String name;
	private String gender;
	private String property;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "ConfigurationPropertiesBean [name=" + name + ", gender=" + gender + ", property=" + property + "]";
	}

}
