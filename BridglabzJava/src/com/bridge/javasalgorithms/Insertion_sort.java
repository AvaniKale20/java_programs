package com.bridge.javasalgorithms;

import com.bridge.util.Utility;

public class Insertion_sort {

	public static void main(String[]args)
{
	int arr[]= {6,2,8,9,1,3};

	int l=arr.length;
	
	for(int i=0;i<l;i++)
	{
	System.out.print(arr[i]+", ");
	}
	System.out.println();
	System.out.println("Length of an array= "+l);
     
	Utility.sort(arr,l);
	
}

}