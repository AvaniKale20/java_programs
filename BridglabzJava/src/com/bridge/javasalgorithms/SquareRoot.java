package com.bridge.javasalgorithms;

import com.bridge.util.Utility;

public class SquareRoot {

	public static void main(String[] args) {
		Double c=Double.parseDouble(args[0]);
		double res=Utility.Sqrt(c);
		System.out.println("Square root of "+c+" is "+res);
		

	}

}