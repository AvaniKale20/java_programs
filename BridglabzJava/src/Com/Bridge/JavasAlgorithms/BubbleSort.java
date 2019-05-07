

package Com.Bridge.JavasAlgorithms;

import java.util.Scanner;

import com.Bridge.util.Utility;

public class BubbleSort {
	public static void main(String[]args)
	{
	
	{Scanner s=new Scanner(System.in);
	//
	System.out.println("length=");
		 	int l=s.nextInt();
	int a[]=new int[l];
		
		//we have to enter the integer value 
		//in array.. we use for loop
		System.out.println("Enter the integer value=");
		for(int i=0;i<l;i++)
        {
	     a[i]=s.nextInt();
         }
		Utility.bubbleSort(a,l);

	}}

	

}
