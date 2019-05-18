package com.bridge.javasalgorithms;

import java.util.Scanner;

public class VENDING_MACHINS {
	static int Note[]= {2000,1000,500,200,100,50,20,10,5,2,1};
	//static int rem=0;
	static int count=0;
	static int res;//here we take result to store the quotiont
	
	static int remmNote[]=new int[10];
	static Scanner s=new Scanner(System.in);
	public static void main( String[]args)
	{System.out.println("enter the amount");
		int amount=s.nextInt();
		int length=Note.length;
		for(int i=0;i<length && amount>0;i++)
		{
			
		res=amount/Note[i];
		amount=amount-Note[i]*res;
		
	if(Note[i]>0 && res!=0)
	        {
			System.out.println("Note of=" +Note[i]);
			System.out.println("Number of Notes="+res);
			
			}
	count=count+res;
	}	System.out.println("total no of notes count is="+count);
		
	}

}