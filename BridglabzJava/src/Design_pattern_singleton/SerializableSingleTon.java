package Design_pattern_singleton;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializableSingleTon implements Serializable {
private SerializableSingleTon()
{
}
public static SerializableSingleTon instance=new SerializableSingleTon();
public static Object readResolve()
{
	return instance;
	
}
	


}
