package Design_pattern_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection_Distroy_main {
	public static void main(String[]args)
	throws InstantiationException,IllegalAccessException, IllegalArgumentException,InvocationTargetException{
		
		singleTonReflectionDistroy instance=singleTonReflectionDistroy.getInstance();
		singleTonReflectionDistroy instance2=null;
		try
		{
			Constructor[]  Constructors=
					singleTonReflectionDistroy.class.getDeclaredConstructors();
			for(Constructor constr:Constructors)
			{
				constr.setAccessible(true);
				instance2=(singleTonReflectionDistroy) constr.newInstance();
				break;
			}
					
	    }catch(Exception e)
		{
	    	e.printStackTrace();
		}
		System.out.println("instanc="+instance);
		System.out.println("instance2="+instance2);
	}
	
}
