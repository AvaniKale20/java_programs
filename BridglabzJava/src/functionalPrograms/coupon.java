package functionalPrograms;


import java.util.Random;
import java.util.Scanner;

public class coupon {
	public static void main(String[]args)
	{   
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NO HOW MANY RANDOM VALUE U WANT");
		int n=s.nextInt();
	
		int ran_value = 0;
	    int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{ Random r=new Random();
			ran_value=r.nextInt(n)+1;
			arr[i]=ran_value;
			   for(int j=0;j<i;j++)
			  {
				if(arr[i]==arr[j])
				{
					i--;
				}
			   }
		}	
		for(int k=0;k<n;k++)
		{
		
			System.out.println(arr[k]);
		}
	}
	

}
