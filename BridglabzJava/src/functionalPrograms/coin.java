//PROGRAM FOR COIN
	//2::Flip Coin and print percentage of Heads and Tails
package functionalPrograms;

import java.util.Scanner;

import util.Utility;

public class coin {
	public static void main(String[]args)
	{Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();// how many time u want to toss a coin
	//there are two part of coin 
		int head=0;
		int tail=0;
		double ran_no=0;
		Utility.coin(n,ran_no,head,tail);
	
	

}
}
