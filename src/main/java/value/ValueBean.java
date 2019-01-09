package value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("value.properties") // directory: src/main/resources
public class ValueBean {

	@Value("${tutorial.author}")
	private String author;

	@Value(" is a handsome boy")
	private String message;

	@Value("#{systemProperties['os.name']}")
	private String osName;

	@Value("#{ T(java.lang.Math).random() * 100.0 }")
	private double randomNumber;

	public void outputResource() {
		try {
			System.out.println(osName); // system name
			System.out.println(randomNumber); // random number
			System.out.println(author + message); // truth
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
