package com.bridge.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.util.LinkedList;

public class UnOrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		//Linked list object created
		
	    LinkedList<String> l1 = new LinkedList<>();	
		Scanner sc=new Scanner(System.in);
		//here we pass the file path
		File f1=new File("/home/user/Desktop/File1.txt");
		
		//file is read using BufferedReader.
		
		BufferedReader br=new BufferedReader(new FileReader(f1));
		String str;
		str=br.readLine();
		//String [] IntegerArray;
		if(str!=null)
		{
			System.out.println("File contents are:="+str);
		}
		
		//split the string and added in WordString array.
		String [] strarr = str.split(" ");
	   
		//list display.
	    for(int i = 0; i < strarr.length;i++)
	     {
	    	 l1.add(strarr[i]);  //add element to list    
	     }
	     l1.show();
	    
	     System.out.println();
	     
	     //taking String from user to search.
	     System.out.println("Enter String which you want to search:");
	     String search=sc.next();
	     if(l1.search(search)) 
	     {
	    	 //if string is found.
	    	 System.out.println("String is found..");
	    	 l1.delete(search);
	    	 System.out.println("String is deleted.....");
	    	 l1.show();
	     }
	     else
	     {
	    	 //if string is not found.
	    	 System.out.println("String is not foud..");
	    	 l1.add(search);
	    	 System.out.println("String is added in file.....");
	    	 l1.show();
	     }        
      }
	
}
	