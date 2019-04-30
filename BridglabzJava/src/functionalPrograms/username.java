//1::User Input and Replace String Template “Hello <<UserName>>, How are you?
package functionalPrograms;

import java.util.Scanner;

import util.Utility;

public class username {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String s1="Heloo<<username>>How r u";
		System.out.println(s1);
		String s2="<<username>>";
		//s2 means u have to enter ur name instead of
				//"<<username>>"
		System.out.println("Enter ur Name");
		String s3=s.nextLine();

		String temp="";//we are taking here empty string
		Utility.username(temp, s2, s3);
	}

}
