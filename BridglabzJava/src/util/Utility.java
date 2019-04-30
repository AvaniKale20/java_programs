package util;

import java.util.Scanner;

import functionalPrograms.StopWatch;
import functionalPrograms.Two_2D_array;
public class Utility {
	
	//1::User Input and Replace String Template “Hello <<UserName>>, How are you?
	public static void username(String temp,String s2,String s3)
	{
		temp=s2;
		s2=s3;
		s3=temp;
		System.out.println("Heloo " +s2+ " "
				+ "How r u ?");
	}
	
	
	
	
	//PROGRAM FOR COIN
	//2::Flip Coin and print percentage of Heads and Tails
	public static void coin(int n,double ran_no,int head,int tail)
	{
		for(int i=1;i<=n;i++)
		{
			ran_no=(int) Math.random();
			if(ran_no>0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
			
		}System.out.println("head="+head+"\n");
		
		System.out.println("tail="+tail+"\n");
		
		
		System.out.println("percentage of head="+100*head/n);
		System.out.println("percentage of tail="+100*tail/n);
		if(head>tail)
		{
			System.out.println("head is greater");
		}
		else
		{
			System.out.println("tail is less");
		}
	}
	/*****************************************************
	 * ***************************************************/
	
	//3::Leap Year
	public static void LeapYear(int n)
	{
		if((n%4==0) || (n%400==0))
		{
			System.out.println("leap yr");
		}
		else
		{
			System.out.println("not leap");
		}
	}
	/*****************************************************************
	 * *************************************
	 * @param n
	 */
	//4::Power of 2 
	public static void power(int res,int n,int i)
	{
		for(i=1;i<=n;i++)
		{
			res=res*2;
			System.out.println("2^"+i+"="+res);
			int l=String.valueOf(res).length();
			if(l==4)
			{
			if((res%4==0)||(res%400==0))
			{
				System.out.println("Given  is leap year"+res);
			}
			}
		} 
	}
	/************************************************************************
	 * 
	 * @param n
	 */
	//5::Harmonic Number 
	public static void harmonic(float num,int h)
	{
		int j;
		for(j=1;j<=h;j++)
	{
		num=num+(float)1/j;
		System.out.println(num);
		
	}
	System.out.println(num);
	
		
	}
	/*****************************************************************************
	 * 
	 * @param n
	 */

	
//6::FUNCTION LOGIC FOR PRIME_FACTOR
	public static void prime_factor(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}	
		
		}if(n>=1)
		{
			System.out.println(n);
		}
		
	}
	/*******************************************************************************************************
	 * 
	 * 
	 */
//7::	Gambler
	public static void gambler()
	{   System.out.println("Enter the stake:");
		int stake=s.nextInt();//HOW MANY CASH U WANT TO INVEST
		System.out.println("Enter the goals:");
		int goals=s.nextInt();//WHAT IS UR TARGET..
		System.out.println("How many time u want to try:");
		int trials=s.nextInt();
		int bet=0;
		int win=0;
		//no of trials start
				for(int i=1;i<trials;i++)
				{int cash=stake;
				       
				   while(cash>0 && cash<=goals)
				  {
					bet++;
					 if(Math.random()<0.5)
					 {
						cash++;
					 }
					 else
					 {
						cash--;
					 }
				  }  
				     if(cash==goals)
				     {
					    win++;
				     }
						
				 }System.out.println(win+"win of"+trials);
					System.out.println("% of game won="+ 100.0* win/trials);
				
			}
			
	
/*******************************************************************************************************
 * 
 */
	//9:: PROGRAM LOGIC FOR 2D array
	static Scanner s=new Scanner(System.in);
	public static void Two_2D_array(int row,int col,int i,int j,int arr[][])
	{
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("2d array is");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
						System.out.print(arr[i][j]+ " ");
				//here we r not taking (println)
				//println works as it goes to next line
				//only if we are taking print no/element will be print in serially
			}
			System.out.println();
			
		}
	}
	/********************************************************************
	 * 
	 */
	//10::(Triplets)Sum of three Integer adds to ZERO
	
		public static boolean find_triplet(int arr[],int sum,int l)
		{
			//for 1st elemsnt of an array
			for(int i=0;i<l-2;i++)
			{
				//for 2nd element of an array
				for(int j=i+1;j<l-1;j++)
				{
					//for 3rd element of an array
					for(int k=j+1;j<l;k++)
					{
						if(arr[i]+arr[j]+arr[k]==0)
						{ System.out.println("Triplets are given=");
							System.out.println("triplets="+arr[i]+" "+arr[j]+" "+arr[k]);
							//return true;
						}return true;
					}
				}
			}return false;
	}
		/********************************************
		 * 
		 */
		//11::Distance  Euclidean distance
		
public static void distance(int x, int y) {
	// TODO Auto-generated method stub
	
	double dis=Math.sqrt(x*x+y*y);
	System.out.println("distance="+dis);
	
}
/******************************************************************************
 * 
 */
    /***************************************************************************************
	 * 
	 */
//13:: StopWatch
	public static void start()
	{
		long StartTime = System.currentTimeMillis();
		System.out.println("Start Time="+StartTime);
	}
	public static void stop()
	{
		long StopTime=System.currentTimeMillis();System.out.println("Start Time="+StopTime);
	}
	
	
	//System.out.println("ElapsedTime="+ElapsedTime);
		public static long ElapsedTime() {
			// TODO Auto-generated method stub
			int StopTime=0;
			int StartTime=0;
			long ElapsedTime=StartTime-StopTime;
			return ElapsedTime;
			
		}
	
	/********************************************************************************************************
	 * 
	 * @param temp
	 * @param speed
	 */
// 16::program WindChill.java //
public static void calculate(double temp, double speed) {
	
	// TODO Auto-generated method stub
	double ress=0.0;
	if(temp>50 || speed>120 || speed<3)
	{
		System.out.println("please enter valid values");
	}
	else {
		 ress=35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(speed,0.16);
	System.out.println(ress);
	}
}	
}
