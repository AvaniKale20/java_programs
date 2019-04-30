package functionalPrograms;

import java.util.Scanner;

import util.Utility;

public class Two_2D_array {public static Scanner s=new Scanner(System.in);
	public static void main(String[]args)
	{
		

		//Scanner s=new Scanner(System.in);
		int row;//it s for row and column
		int col;
		int [][]arr=new int[10][10];//declaration of array
		int i=0,j=0;
		//permutations program in java 

		System.out.println("enter no for row");
	 row=s.nextInt();
		System.out.println("enter col value");
		col=s.nextInt();
		System.out.println("Enter element =");
		
		Utility.Two_2D_array(row, col, i, j, arr);
		
		
	}

}
