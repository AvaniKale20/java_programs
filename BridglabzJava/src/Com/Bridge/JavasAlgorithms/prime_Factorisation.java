package Com.Bridge.JavasAlgorithms;
import java.util.Scanner;

public class prime_Factorisation {
	static Scanner s=new Scanner(System.in);
	 public static int i=0;
	 public static int j=0;
	 public static int temp=0;
	 //public static int f,l;
	public static void main(String[]args)
	{
	
		System.out.println("enter range no");
		int f=s.nextInt();
     //   System.out.println("2nd no");
       // int l=s.nextInt();
    prime(f);
	}
	/////////
	public static void prime(int f)
    {
		
        for(i=2;i<f;i++)
        {
        	boolean r=true;
        	for(j=2;j<i;j++)
        	{
        		if(i%j==0)
        		{
        	    r=false;
        			break;
        			
        		}
        	}if(r)
    		{
    			System.out.println("prime no="+i);
    			//temp=i;
    			 palindrome(i);
    		}
         }
       
     }
////////
    private static void palindrome(int k) {
		// TODO Auto-generated method stub
    	int sum=0;
    	int rem=0;
    	int temp=k;
    	while(k!=0)
    	{
    		rem=k%10;
    		sum=sum*10+rem;
    		k=k/10;
       	}
    	if(temp==sum)
    	{
			System.out.println("palindrome no and anagram no are same ="+sum);
    	} 	
    	
	}
    
	}

	