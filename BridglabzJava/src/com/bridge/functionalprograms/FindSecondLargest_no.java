package com.bridge.functionalprograms;

import java.util.Scanner;

public class FindSecondLargest_no {
	public static void main(String[]args)
	{
int arr[]= {1,4,6,3,2};
int length=arr.length; 
	// TODO Auto-generated constructor stub

System.out.println("length is="+length);
System.out.println("enter the element");
for(int i=0;i<length;i++)
{
	System.out.println(arr[i]);
}

int First=0;
int sec=0;
for(int i=0;i<length;i++)
{
	if(arr[i]>First)
	{
		sec=First;
		First=arr[i];
	}
	else
		if(arr[i]>sec)
		{
			sec=arr[i];
		}
}
System.out.println("Second highest No is="+sec);
}
}

	




