package Com.Bridge.JavasAlgorithms;

import java.util.Scanner;

public class All_search_sort {public static int mid=0;
	public static int arr[]= {33,45,56,77,89,90};

	static Scanner s=new Scanner(System.in);
	public static void main(String[]args)
	{// TODO Auto-generated method stub
		System.out.println(" 1:binary_search_Int()");
		System.out.println(" 2:binary search for string=");
		System.out.println("3: bubble sort for int=");
		System.out.println("4: bubble sort for string");
		System.out.println("5: insertion sort for int");
		System.out.println("6: insertion sort for string");
		System.out.println("enter the ur choice");
		int c=s.nextInt();
		switch(c)
		{
		case 1:int mmm=binary_search_Int();
		
	    System.out.println("index of that no="+ mmm );
		System.out.println("no is found");
		
		break;
		
		case 2:Binary_string();
		break;
		case 3:	bubble_sort_int();
		break;
		case 4:	bubble_sort_String();
		break;
		case 5:insertion_int();
		break;
		case 6:insertion_str();
		break;
		default: System.out.println("default");
		
			
		}
	}
	private static void insertion_str() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("6:--string element for insertion");
		String insertion[]= {"avani","zaid","pranali","sunil","yy"};
		int len3=insertion.length;
		System.out.println("length="+len3);
		for(int i=0;i<len3;i++)
		{
		System.out.print(insertion[i]+" , ");
		}
		for(int i=1;i<len3;i++)
		{
			String value= insertion[len3];
			int j=i-1;
		//	while(j>=0 && j<insertion[j])
			{
				
			}
		}
		
	}
	private static void insertion_int() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("5:--Element integer for insertion sort=");
		int ins[]= {8,5,3,90,12,45,60};
		int l2=ins.length;
		for(int i=0;i<l2;i++)
		{
			System.out.print(ins[i]+" , ");
		}
		System.out.println("length ="+l2);
		for(int j=1;j<l2;j++)
		{
		int value=ins[j];
		int k=j-1;
		while(k>=0 && ins[k]<value )
		{
			ins[k+1]=ins[k];
			//at index 1
			k--;
		}
		ins[k+1]=value;
		}
		for(int x:ins)
		{
			System.out.print(x+" , ");
		}
	}
	private static void bubble_sort_String() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("4:--string element for bubble sort");
		String str[]= {"avani","zaid","pranali","sunil","yy"};
		int len=str.length;
		System.out.println("length="+len);
		for(int i=0;i<len;i++)
		{
		System.out.print(str[i]+" , ");
		}
		for(int k=0;k<len;k++)
		{
			for(int j=k+1;j<len;j++)
			{
				if(str[k].compareTo(str[j])>0)
				{
					String temp1;
					temp1=str[k];
					str[k]=str[j];
					str[j]=temp1;
				}
			}
		}
		System.out.println();
		System.out.println("*after bubble sort for string=");
		for(int j=0;j<len;j++)
		{
			System.out.print(str[j]+" , ");
		}
		
		
	}
	/***********
	 * 
	 */
	
    private static void bubble_sort_int() {
		// TODO Auto-generated method stub
    	System.out.println();
    	System.out.println("3:--element for bubble_sort=");
    	int buble[]= {5,7,9,2,1,90};
    	int le=buble.length;
    	for(int i=0;i<le;i++)
    	{
    		System.out.print(buble[i]+" , ");
    	}
    	System.out.println();
    	System.out.println("length="+le);
    	for(int r=0;r<le-1;r++)
    	{
    		for(int j=0;j<le-1;j++)
    		{
    			if(buble[j+1]<buble[j])
    				{int temp;
    			temp=buble[j];
    			buble[j]=buble[j+1];
    			buble[j+1]=temp;
    				}	
    		}
    	}
    	for(int j=0;j<le;j++)
    	{
    		System.out.println("sorted elemnts="+buble[j]);
    	}
    	
		
	}
/***********
 * 
 * @return
 */
	
	private static int binary_search_Int() {
		
		int l=arr.length;
		System.out.println("1:--length of an binary search array=");
		
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" , ");
		}
		System.out.println();
		int search=90;
		int low=0;
		int high=l-1;
		while(low<=high) {
		    
			  mid=(low+high)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(search>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
			
		}
		return mid;
	}
	/******
	 * 
	 */
	//
	private static void Binary_string() {
		// TODO Auto-generated method stub
		System.out.println();
		String arr1[]= {"avani","depu","harshal","sunil","pranali","zaid"};
		sort(arr1);
	}
	public static void sort(String arr[])
	{	String search="harshal";
		System.out.println("2:--for binary search String");
				int lo=0;int r=arr.length-1;
				boolean flag=true;
				while(flag)
				{
				int mid=(lo+r)/2;
				int res=(search.compareTo(arr[mid]));
						
						if(res==0)
						{
							System.out.println("mid found at "+mid);
							flag=false;
						}
						else if(res>0)
					    {
						lo=mid+1;
					     }
					   else
					    {
						r=mid-1;
					    }
				}
				
	}
	}
