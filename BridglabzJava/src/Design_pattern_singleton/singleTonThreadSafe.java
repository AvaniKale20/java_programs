package Design_pattern_singleton;

public class singleTonThreadSafe {
	private static singleTonThreadSafe instance;
	private singleTonThreadSafe()
	{
		
	}
/*****************************************
 * HERE WE USE DOUBLE cHECKED LOCKING CONCEPT
 * @return:singleTonThreadSafe
 */
        	public static singleTonThreadSafe getInstance(){
        	    if(instance == null){
        	        synchronized (singleTonThreadSafe.class) {
        	            if(instance == null){
        	                instance = new singleTonThreadSafe();
        	            }
        	        }
        	    }
        	    return instance;
        	}

}
