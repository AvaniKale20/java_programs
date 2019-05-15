package Design_Pattern;

public class computer_factory {
	 public static computer getcomputer(String type, String ram, String hdd, String cpu)
	 {
		 if("pc".equalsIgnoreCase(type))
			 return new pc(ram, hdd, cpu);
		 else if("Server".equalsIgnoreCase(type))
			 return new server(ram, hdd, cpu);
		return null;
			
//		return null;
		 
	 }

}
