//3::Leap Year
package Com.Bridge.FunctionalPrograms;

import java.util.Scanner;

import com.Bridge.util.Utility;

public class LeapYear {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year which is u want to cheak it is leap or Not");
		int n=s.nextInt();
		Utility.LeapYear(n);
	}

}
