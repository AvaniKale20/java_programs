package functionalPrograms;

import java.util.Scanner;

import util.Utility;
// PROGRAM FOR PRIME_FACTOR....
public class PrimeFactor {
	public static void main(String[] args) {

		System.out.println("enter no that u want prime  factor:=");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Utility.prime_factor(n);
	}

}

//
