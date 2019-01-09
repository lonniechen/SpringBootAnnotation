package autowired;


/**
 * @author Lang
 *
 *	@Autowired is a Spring annotation, which automatically instantiate an instance of a bean for a field in another bean
 *	@Autowired tries to guess the bean to be injected:
 *	1. It guess by looking at the field class type, and tries to find a bean from the same class
 *  2. If it can't find such a bean, @Autowired will look at the name of the field, and tries to find bean with the same name 
 *  3. If it can't find a bean by both type and name, it will report error, unless the "required" is set to be false
 *  In some situations, we may want to use @Qualifier("name") to tell @Autowired to inject a specific bean 
 */
public class Info {
	
}
