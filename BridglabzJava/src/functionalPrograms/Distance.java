package functionalPrograms;

import java.util.Scanner;

public class Distance {
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of X:");
	int x=s.nextInt();
	System.out.println("Enter the value of X1");
	int x1=s.nextInt();
	System.out.println("Enter the value of Y1:");
int y1=s.nextInt();
System.out.println("Enter the value of y2: ");
int y2=s.nextInt();
double res=0;
//euclidian program square root of (x1-y1)^2
//+(y1-y2)^2
res=Math.sqrt((x-y1)*(x-y1)+(x1-y2)*(x1-y2));
System.out.println("res="+res);
}
}