package runWith;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import component.ComponentBean;

@RunWith(SpringJUnit4ClassRunner.class)
@Import(component.ComponentBean.class)
public class RunWithTest {

	@Autowired
	private ComponentBean cb;

	@Test
	public void test() {
		System.out.println(cb.getMessage());
	}

}
