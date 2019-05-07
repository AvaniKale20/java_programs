package Com.Bridge.JavasAlgorithms;
import java.util.Scanner;

import com.Bridge.util.Utility;

//MAIN PROGHRAM
import java.util.Scanner;

public class binary_search

{
static String s1;
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
	    
		String []a=new String[6];
	
		
		//int l=a.length;
		//System.out.println("length=");
		System.out.println("enter names");
		for(int i=0;i<6-1;i++)
	{
		a[i]=s.next();
		
	}
	System.out.println(":enter ur string" );
	 s1=s.next();
	
	
	int mmmm=Utility.binary_search( a,s1);
	System.out.println("mid="+mmmm);
	System.out.println("string is found");
		
		
	}
	

	}


