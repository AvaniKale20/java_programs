package com.bridge.javasalgorithms;

import java.util.Scanner;

import com.bridge.util.Utility;

public class Temp_cel {
	public static void main(String[]args)
	{
		Scanner s=new Scanner (System.in);
		double FahrenheitTemp;
		double CelsiusTemp;
		System.out.println("Enter the temperature in celcius=");
		FahrenheitTemp=s.nextDouble();
		Utility.fahrenheit(FahrenheitTemp);
		
		System.out.println("Enter the temperature in fahrenheit=");
		CelsiusTemp=s.nextDouble();
		Utility.CelsiusTemp(CelsiusTemp);
		System.out.println();
	}

}
