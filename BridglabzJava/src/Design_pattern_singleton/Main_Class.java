package Design_pattern_singleton;

public class Main_Class {
	public static void main(String[] args)

	{/*************************
		 * SINGLETON EGAL INITIALISATION
		 * @output: Design_pattern.SingleTonEgal@2f0e140b
                    Design_pattern.SingleTonEgal@2f0e140b
         *   //here we created two abject of same class that time it will give same instance as o/p
         */
		System.out.println("================singleTonEgal====================");
		SingleTonEgal singleTonEgal=SingleTonEgal.getInstance();
		System.out.println("singleTonEgal="+singleTonEgal);
		SingleTonEgal singleTonEgal1=SingleTonEgal.getInstance();
		System.out.println("singleTonEgal="+singleTonEgal1);
		
		/*************************
		 * SINGLETON StaticBlock INITIALISATION
		 * @output: Design_pattern.SingleTonStaticBlock@49476842
                    Design_pattern.SingleTonStaticBlock@49476842
         *  //here we created two abject of same class that time it will give same instance as o/p
		 */
		System.out.println();
		System.out.println("================singleTonStaticBlock====================");
		SingleTonStaticBlock singleTonStaticBlock=SingleTonStaticBlock.getInstance();
		System.out.println("singleTonStaticBlock="+singleTonStaticBlock);
		SingleTonStaticBlock singleTonStaticBlock1=SingleTonStaticBlock.getInstance();
		System.out.println("singleTonStaticBlock="+singleTonStaticBlock1);
		
		/********************************************
		 * @output  Design_pattern.SingleLazy@27c170f0

		 * SINGLETON Lazy INITIALISATION
		 */
		System.out.println();
		System.out.println("================singleLazy====================");
		SingleLazy singleLazy=SingleLazy.getInstance();
		System.out.println(singleLazy);
		
		/********************************************
		 * SINGLETON ThrreadSafe INITIALISATION
		 * @output : singletonThreadSafe=Design_pattern.singleTonThreadSafe@2626b418
		 */
		System.out.println();
		System.out.println("================singleTonThreadSafe====================");
		singleTonThreadSafe singletonThreadSafe=singleTonThreadSafe.getInstance();
		System.out.println("singletonThreadSafe="+singletonThreadSafe);
		
		/**************************************
		 * @output:SingletonBillPugh=Design_pattern.SingletonBillPugh@2c7b84de
                    SingletonBillPugh=Design_pattern.SingletonBillPugh@2c7b84de
         * SINGLETON Singleton BillPugh INITIALISATION
		 */
		System.out.println();
		System.out.println("================SingletonBillPugh====================");
		SingletonBillPugh singletonBillPugh=SingletonBillPugh.getInstance();
		System.out.println("SingletonBillPugh="+singletonBillPugh);
		SingletonBillPugh singletonBillPugh1=SingletonBillPugh.getInstance();
		System.out.println("SingletonBillPugh="+singletonBillPugh1);
		/*******************************************************
		 * 
		 */

	}
	

}
