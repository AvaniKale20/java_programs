package com.bridge.datastructure;


import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
	

		public static void main(String[] args) 
		{
			try {	Stack<Character> stack = new Stack<Character>();
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the equation");
				String name = sc.next();
				
				
				int length = name.length();
				System.out.println("length="+length);
				
				for(int i = 0; i<length ; i++)
				{
					char ch = name.charAt(i);
					
					if(ch == '(')
					{
						stack.push(ch); //adding the element in to stack
					}
					else if(ch == ')')
					{	
					stack.pop(); // remove the elment from stack 
								
						}				
						
					}			
				if(stack.isEmpty()==true) // condition to check object is empty or not
				{
					System.out.println("Arithmatic Expression Balnaced");
				}
				else
				{
					System.out.println("Arithmatic Expression is Unblanced");
				}
				}
		catch(Exception e)
		{
			System.out.println("Enter the Valid data");
		}
	    	}
}

