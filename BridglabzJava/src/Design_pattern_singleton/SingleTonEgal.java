package Design_pattern_singleton;

public class SingleTonEgal {
	
	//have same class name type variable
	private static SingleTonEgal instance=new SingleTonEgal();
	
	/***********************************
	 * @constructor 
	 * // constructor should be private ..
	 */
	SingleTonEgal()
	{
		System.out.println("singleton being initialisation");
	}
	
	/**************
	 * @return SingleTonStaticBlock
	 * //here we write getInstance method and there return type is SingleTonEgal
	 */
	public static SingleTonEgal getInstance()
	{
		return instance;
		
	}

	
}
