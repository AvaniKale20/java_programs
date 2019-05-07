package Com.Bridge.JavasAlgorithms;

public class Merge_sort {
	 public static  int array[];
	public static int length;
	public static int tempArray[];
	public static void main(String[]args)
	
	//for(int u:array)
//		{
//		System.out.print(u+",");
//	}
//	System.out.println();
	{
		int []Ip_array= {84,95,78,12,45,65,10};
		int l=Ip_array.length;
		System.out.println("Input array given=");
		for(int i=0;i<l;i++)
		{
			System.out.print(Ip_array[i]+", ");
		}
		System.out.println();
		System.out.println("length of an array="+l);
		sort(Ip_array);
		System.out.println("sorted List is");
		for(int u:Ip_array)
		{
			System.out.print(u+",");
		}
	
	}
	private static void sort(int[] Input) {
		// TODO Auto-generated method stub
		array=Input;
		length=Input.length;
		 tempArray=new int[length];
	
		divide(0,length-1);
		 
	}
	public static void divide(int lower ,int higher)
	{
		if(lower<higher)
		{// it is for to find out the mid
			
			int mid=(higher+lower)/2;
			//it is for left side
			//it will sort left side of an array
			//recurtion is happen
			divide(lower,mid);
			//it is for right side.. it will sort right side of an array
			//recurtion is happen
			divide(mid+1,higher);
			merge_array( lower,mid, higher);
		}
	}
	public static void merge_array(int lower,int mid,int higher)
	{
		for(int i =lower;i<=higher;i++)
		{
			tempArray[i]=array[i];
		}
		
		int i=lower;
		int middle=mid+1;
		int k=lower;for(int u:array)
//		{
//			System.out.print(u+",");
//		}
//		System.out.println();
		while(i<=mid && middle<=higher)
		{
			if(tempArray[i]<tempArray[middle])
				{
			array[k]=tempArray[i];
			i++;
				}
		else
		{
			array[k]=tempArray[middle];
			middle++;
		}
		k++;
		}
	 while(i<=mid)
		{
			array[k]=tempArray[i];
			i++;
			k++;
		}
		
	}

}