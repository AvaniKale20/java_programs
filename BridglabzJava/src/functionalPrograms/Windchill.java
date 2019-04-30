package functionalPrograms;

import java.util.Scanner;

import util.Utility;
public class Windchill {public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	
	double temp=s.nextDouble();
	double speed=s.nextDouble();
	
	Utility.calculate(temp,speed);
	
	}


}
