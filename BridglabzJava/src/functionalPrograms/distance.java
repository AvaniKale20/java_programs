package functionalPrograms;

import java.util.Scanner;

import util.Utility;

public class distance {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the X value=");
		int x=s.nextInt();
		System.out.println("Enter the Y value");
		int y=s.nextInt();
		Utility.distance(x,y);
		
	}

}
