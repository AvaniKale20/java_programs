package Com.Bridge.Oops;

//package JsonProgram;
//import Java_to_json.emp;
//import JsonProgram.utilJson;

public class t {
	public static void main(String[]args)
	{
		emp e=new emp();
		e.setId(10);
		e.setName("avani");
		e.setSal(2000);
		String r=utilJson.convert_java_jason(e);
	System.out.println(	"Result="+r);
	}

	
}

