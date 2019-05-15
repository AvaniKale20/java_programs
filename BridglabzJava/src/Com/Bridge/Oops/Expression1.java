package Com.Bridge.Oops;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;
/*******************************************************************
 * program No:2 Regular Expression Demonstration
 *  Using by Regex
 *
 */
public class Expression1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String msg = "Hello <<name>>, We have your full name as <<full name>> in our system. \n"
				+ " * your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz \n"
				+ " * 01/01/2016";

		System.out.println(msg);

		System.out.println("Enter your first name");
		String firstName = sc.nextLine();

		System.out.println("Enter your last name");
		String lastName = sc.nextLine();

		String Fullname = firstName + " " + lastName;
/*********************************************************************
 * WE USE HERE PATTERN CLASS WHICH PROVIDED BY (PACKAGE regex) AND CREATE HERE THE OBJECT OF PATTERN CLASS 
 * BY USING COMPILE() method ....and compile() is METHOD OF PATTERN CLASS...
 * PATTERN OBJECT REPRESENT  THE COMPILED VERSION OF REGULAR EXPRESSION
 * (public static pattern compile(String regex);)
 */
		Pattern r = Pattern.compile("[a-zA-Z]+");//Regular Expression
		// it is user for FirstName and Full name
/**********************************************************************
 * 1> here we use Matcher class method matcher() methode.
 * 2> here we used replacemant method
 * 3> here we use replaceAll method to replced perpose
 * 4> 1st replacement for FirstName and SecName.
 */
		
		if (Pattern.matches("[a-zA-z]+", firstName)) {
			msg = msg.replaceAll("<<name>>", firstName);
			msg = msg.replaceAll("<<full name>>", Fullname);
		}

		System.out.println("Enter the mobile number");
		String mobileNo = sc.next();
		
		//replacement for number
		
		//regular expression for Number is- [789][0-9]{9}

		if (Pattern.matches("[789][0-9]{9}", mobileNo))//[789][0-9]{9}
		{
			msg = msg.replaceAll("x{10}", mobileNo);
		}

		System.out.println("Enter the date");
	
		String date = sc.next();

		DateTimeFormatter date_time_formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		LocalDate now = LocalDate.now();

		String day = "";

		System.out.println(day = date_time_formatter.format(now));
//^ matches the begining of the line
		//$ matches last line
		if (Pattern.matches("^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$", day)) {
			msg = msg.replaceAll("01/01/2016", day);
		}

		System.out.println(msg);

	}
}
