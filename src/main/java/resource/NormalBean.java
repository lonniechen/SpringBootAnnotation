package resource;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class NormalBean {
	
	@Resource
	ResourceBean1 resourceBean1;
	
	@Resource
	ResourceBean2 beanByType;
	
	@Resource(name="rb3")
	ResourceBean3 thirdRB;
	
	@Resource(type=ResourceBean4.class)
	ResourceBean4 fourthRB;
	
//	if both type and name are used, then any mismatch of this two result in error
//	@Resource(name="rb5",type=ResourceBean4.class)
//	ResourceBean5 errorRB1;
//	
//	@Resource(name="rb4",type=ResourceBean5.class)
//	ResourceBean5 errorRB2;
	
	@Resource(name="rb5",type=ResourceBean5.class)
	ResourceBean5 fifthRB;
	
}
