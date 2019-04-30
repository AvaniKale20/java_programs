package functionalPrograms;
import java.util.Scanner;

public class permutation {
	public static int count=0;
	public static void permutationn(String s1,int i,int n)
	// i=0; for starting
    //n=length-1
  { 
	int count=0;
	int j=0;
	   if(i==n)
      {
	   {
        System.out.println("string ="+s1);
	 
	  } 
      }
       else
      {
	     for(j=i;j<=n;j++)// we take j for index
        {
	    	 s1=swap(s1,i,j);
	    	//swap((s1+i),(s1+j) );
	    	permutationn(s1,i+1,n);
	    	//swap((s1+i),(s1+j));
	    	s1=swap(s1,i,j);

        }		
      }

    }
public static String swap(String s1,int i,int j)
{
	char [] a=s1.toCharArray();
	char temp;
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	return String.valueOf(a);
}
public static void main(String[]args)
	{ Scanner s=new Scanner(System.in);
	    System.out.println("ENTER THE STRING= ");
		String s1=s.next();
		int l=s1.length();
		
		System.out.println("length=" +l);
		
		int i=0;int n=l-1;
	permutationn(s1,i,n);//caling function
	
	
	
	}
}