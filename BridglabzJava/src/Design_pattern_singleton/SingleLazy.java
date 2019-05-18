package Design_pattern_singleton;

public class SingleLazy {
	/**********************
	 * 
	 */
	private SingleLazy()
	{
		
	}
	private static SingleLazy instance ;
	public static SingleLazy getInstance()
	{
		if(instance==null)
		{
			instance=new SingleLazy();
		}
		return instance;
		
	}

}
