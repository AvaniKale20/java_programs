package functionalPrograms;
import java.util.Scanner;

import util.Utility;

public class power {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No:= ");
		int n=s.nextInt();
		int res=2;int i=0;
		Utility.power(res,n,i);
	}

}
