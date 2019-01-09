package springBootTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = restController.Application.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestCase1 {

	@Test
	public void test() {
		String url = "http://localhost:8080/bean";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		System.out.println(response.getBody());
	}

}
