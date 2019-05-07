package Com.Bridge.JavasAlgorithms;

import java.util.Scanner;

import com.Bridge.util.Utility;

public class DayOfWeek {
static	Scanner s=new Scanner(System.in);
	
	public static void main(String[]args)
	{
	System.out.println("Enter the month & year & day");
		int month=s.nextInt();
		int year =s.nextInt();
		int day=s.nextInt();
	int result=Utility.DayOfWeek(month,year,day);	
	System.out.println("day of week ="+result);
	}

}
