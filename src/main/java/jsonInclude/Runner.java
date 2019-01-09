package jsonInclude;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner {
	
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper om  = new ObjectMapper();
		
		JsonCase1 jc1 = new JsonCase1();
		jc1.setName("Siu Po");
		jc1.setAge(20);
		jc1.setWeight(165);
		
		String jc1Str = om.writeValueAsString(jc1);
		System.out.println(jc1Str);
		
		JsonCase2 jc2 = new JsonCase2();
		jc2.setLocation("HBAP");
		jc2.setJc1(jc1);
		
		String jc2Str = om.writeValueAsString(jc2);
		System.out.println(jc2Str);
	}
	
}
