package com.bridge.javasalgorithms;

import java.util.Scanner;

import com.bridge.util.Utility;

public class MonthlyPayment {
static 	Scanner s=new Scanner(System.in);
	
	public static void main(String[]args)
	{
		double P=s.nextDouble();
		double Y=s.nextDouble();
		double  R=s.nextDouble();
		double ret=Utility.MonthlyPayment(P,Y,R);
		System.out.println("Monthly payment="+ret);
		
	}

}
