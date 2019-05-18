package Design_pattern_singleton;

public class SingleTonStaticBlock {
	/*********************
	 * create the private static variable of same type class
	 * that created object pointed to this referance
	 */
	private static SingleTonStaticBlock instance1;
	/***********************************
	 * @constructor 
	 */
	private SingleTonStaticBlock()
	{
		
	}
	/*******************
	 * Static block: static block call only once
	 * &  object created only once
	 */
	static {
		try {
			instance1=new SingleTonStaticBlock();
		}catch(Exception e)
		{
			throw new RuntimeException("Exception accure in creating singletone instance");
		}
	}
	/**************
	 * @return SingleTonStaticBlock
	 * //here we write getInstance method and there return type is SingleTonEgal
	 */
	public static SingleTonStaticBlock getInstance()
	{
		return instance1;
		 
	}
	

}
