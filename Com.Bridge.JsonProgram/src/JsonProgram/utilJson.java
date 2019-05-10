package JsonProgram;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

//import Java_to_json.emp;


// it is helper class  
public class utilJson {
	
	
	//create a variable
	private static ObjectMapper mapper;
// we are taking one static block 
	//static block executed only once so object created only once
	static {
		mapper=new ObjectMapper();
	}
	public static String convert_java_jason(Object object)
	{
	String result="";
	try {
		result=mapper.writeValueAsString(object);
	} catch (JsonGenerationException e) {
		// TODO Auto-generated catch block
		System.out.println("converting java object into json");
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return result;
		
	}
	
}


