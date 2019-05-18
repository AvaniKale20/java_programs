//3::Leap Year
package com.bridge.functionalprograms;

import java.util.Scanner;

import com.bridge.util.Utility;

public class LeapYear {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year which is u want to cheak it is leap or Not");
		int n=s.nextInt();
		Utility.LeapYear(n);
	}

}
