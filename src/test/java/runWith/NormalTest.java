package runWith;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

import component.ComponentBean;

@Import(component.ComponentBean.class)
public class NormalTest {

	@Autowired
	private ComponentBean cb;

	@Test
	public void test() {
		System.out.println(cb.getMessage());
	}

}
