package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NormalBean {

//	this one is OK because @Autowired first look at the type
	@Autowired
	AutowiredBean1 theFirstAutowiredBean;

//	error comes up because Spring cannot find this bean as the corresponding class is not under @Compoenent or @Bean
//	@Autowired
//	AutowiredBean2 autowiredBean2;
	
	@Autowired(required=false)
	AutowiredBean2 autowiredBean2;
	
	@Autowired
	AutowiredBean autowiredBean3;

	@Autowired
	AutowiredBean autowiredBean4;
	
//	error comes up as @Autowired dosen't know which class should be injected into this two bean
//	@Autowired
//	AutowiredBean anonymousBean1;
//
//	@Autowired
//	AutowiredBean anonymousBean2;
	
	@Autowired
	@Qualifier("autowiredBean5")
	AutowiredBean anonymousBean1;

	@Autowired
	@Qualifier("autowiredBean6")
	AutowiredBean anonymousBean2;
	


}
