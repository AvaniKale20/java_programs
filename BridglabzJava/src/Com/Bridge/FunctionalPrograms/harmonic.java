package Com.Bridge.FunctionalPrograms;

import java.util.Scanner;

import com.Bridge.util.Utility;

public class harmonic {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no:=");
		int h=s.nextInt();
		float num=0f;
	
		Utility.harmonic(num,h);
	}

}