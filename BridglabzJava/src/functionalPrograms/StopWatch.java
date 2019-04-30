package functionalPrograms;
import util.Utility;
import java.util.Scanner;
public class StopWatch {
	
//public static long StartTime=0;
//public static long StopTime=0;
//public static long ElapsedTime;
static Scanner s=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter No:1 to start the Time");
		int n=s.nextInt();
		Utility.start();
		System.out.println("enter No:2 to stop the Time");
		int nn=s.nextInt();
		Utility.stop();
		
		long result;
		result=Utility.ElapsedTime();
		System.out.println("total Time ElAPSED (IN millisec) is="+result);
		System.out.println("convrt millisec to sec"+(result/1000)+"sec");
		
		
	}

}
