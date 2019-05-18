package Design_pattern_singleton;

public class EnumMain {
	public static void main(String[]args)
	{
	SingleEnum instance1=SingleEnum.instance;
	SingleEnum instance2=SingleEnum.instance;
	System.out.println(instance1.getValue());
	instance1.setValue(1);
	System.out.println(instance2.getValue());
	instance2.setValue(2);
	

}
}
