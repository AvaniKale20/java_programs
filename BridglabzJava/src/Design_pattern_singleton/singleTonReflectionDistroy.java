package Design_pattern_singleton;

public class singleTonReflectionDistroy {
	
	private singleTonReflectionDistroy()
	{
		
	}
	 public static singleTonReflectionDistroy getInstance()
	 {
		return Reflection.instance;
		 
	 }
	 private static class Reflection
	 {
		 static singleTonReflectionDistroy instance=new singleTonReflectionDistroy();
	 }

}
