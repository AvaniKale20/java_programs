package com.bridge.util;

import java.util.Scanner;

import com.bridge.functionalprograms.StopWatch;
import com.bridge.functionalprograms.Two_2D_array;

public class Utility {
	/*********************************************************************************************************
	 * 1::User Input and Replace String Template “Hello <<UserName>>, How are you?
	 *    // temp , s2 , s3 are taking for swapping 
	 * @param temp=the purpose of temp is to store the value of s2.
	 * @param s2 the va;ue of s3 is assign to s3.
	 * @param s3 the value of temp is assing to s3.
	 */

	public static void username(String temp, String s2, String s3) {
		temp = s2;
		s2 = s3;
		s3 = temp;
		System.out.println("Heloo " + s2 + " " + "How r u ?");
	}

	/*************************************************************************************************************
	 * 
	 * //PROGRAM FOR COIN //2::Flip Coin and print percentage of Heads and Tails
	 * 
	 * @param n= how many time u have to toss a coin
	 * @param ran_no
	 * @param head=coin one side is head
	 * @param tail=coin one side is tail.
	 */

	public static void coin(int n, double ran_no, int head, int tail) {
		for (int i = 1; i <= n; i++) {
			ran_no = (int) Math.random();
			if (ran_no > 0.5) {
				head++;
			} else {
				tail++;
			}

		}
		System.out.println("head=" + head + "\n");

		System.out.println("tail=" + tail + "\n");

		System.out.println("percentage of head=" + 100 * head / n);
		System.out.println("percentage of tail=" + 100 * tail / n);
		if (head > tail) {
			System.out.println("head is greater");
		} else {
			System.out.println("tail is less");
		}
	}

	/****************************************************************************************
	 * //3::Leap Year
	 * 
	 * @param n=for year, u have to check that year is leap or Not
	 */

	public static void LeapYear(int n) {
		if ((n % 4 == 0) || (n % 400 == 0)) {
			System.out.println("leap yr");
		} else {
			System.out.println("not leap");
		}
	}

	/************************************************* how many time u want to toss a coin***************************************************
	 * //4::Power of 2
	 * 
	 * @param res whatever result we get that will be store in res
	 * @param n power value N
	 * @param i for loop
	 */

	public static void power(int res, int n, int i) {
		for (i = 1; i <= n; i++) {
			res = res * 2;
			System.out.println("2^" + i + "=" + res);
			int l = String.valueOf(res).length();
			if (l == 4) {
				if ((res % 4 == 0) || (res % 400 == 0)) {
					System.out.println("Given  is leap year" + res);
				}
			}
		}
	}

	/******************************************************************************
	 * //5::Harmonic Number
	 * 
	 * @param num
	 * @param h=harmonik value n
	 */

	public static void harmonic(float num, int h) {
		int j;
		for (j = 1; j <= h; j++) {
			num = num + (float) 1 / j;
			System.out.println(num);

		}
		System.out.println(num);

	}

	/*****************************************************************************
	 * //6::FUNCTION LOGIC FOR PRIME_FACTOR
	 * 
	 * @param n= Print the factor of number
	 */

	public static void prime_factor(int n) {
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}

		}
		if (n >= 1) {
			System.out.println(n);
		}

	}

	/*******************************************************************************************************
	 * //7:: Gambler
	 * 
	 */

	public static void gambler() {
		System.out.println("Enter the stake:");
		int stake = s.nextInt();// HOW MANY CASH U WANT TO INVEST
		System.out.println("Enter the goals:");
		int goals = s.nextInt();// WHAT IS UR TARGET..
		System.out.println("How many time u want to try:");
		int trials = s.nextInt();
		int bet = 0;
		int win = 0;
		// no of trials start
		for (int i = 1; i < trials; i++) {
			int cash = stake;

			while (cash > 0 && goals > cash) {
				bet++;
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;
				}
			}
			if (cash == goals) {
				win++;
			}

		}
		double winPercent = 100.0 * win / trials;
		System.out.println(win + " wins of " + trials + "  trials");

		System.out.println("Percent of games won = " + 100.0 * win / trials);
		System.out.println("percentage of loss = " + (100 - winPercent));
	}

	/*******************************************************************************************************
	 * //8: Two_D_array
	 * 
	 * @param row
	 * @param col
	 * @param i i & j for index.
	 * @param j
	 * @param arr to store the value
	 */

	static Scanner s = new Scanner(System.in);

	public static void Two_2D_array(int row, int col, int i, int j, int arr[][]) {
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println("2d array is");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
				// here we r not taking (println)
				// println works as it goes to next line
				// only if we are taking print no/element will be print in serially
			}
			System.out.println();

		}
	}

	/********************************************************************
	 * //10::(Triplets)Sum of three Integer adds to ZERO
	 * 
	 * @param arr
	 * @param sum
	 * @param l
	 * @return
	 */

	public static boolean find_triplet(int arr[], int sum, int l) {
		// for 1st elemsnt of an array
		for (int i = 0; i < l - 2; i++) {
			// for 2nd element of an array
			for (int j = i + 1; j < l - 1; j++) {
				// for 3rd element of an array
				for (int k = j + 1; j < l; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("Triplets are given=");
						System.out.println("triplets=" + arr[i] + " " + arr[j] + " " + arr[k]);
						// return true;
					}
					return true;
				}
			}
		}
		return false;
	}

	/********************************************
	 * //11::Distance Euclidean distance
	 * 
	 * @param x
	 * @param y
	 */

	public static void distance(int x, int y) {
		// TODO Auto-generated method stub

		double dis = Math.sqrt(x * x + y * y);
		System.out.println("distance=" + dis);

	}

	/***************************************************************************************
	 * 
	 */
//13:: StopWatch
	public static void start() {
		long StartTime = System.currentTimeMillis();
		System.out.println("Start Time=" + StartTime);
	}

	public static void stop() {
		long StopTime = System.currentTimeMillis();
		System.out.println("Start Time=" + StopTime);
	}

	// System.out.println("ElapsedTime="+ElapsedTime);
	public static long ElapsedTime() {
		// TODO Auto-generated method stub
		int StopTime = 0;
		int StartTime = 0;
		long ElapsedTime = StartTime - StopTime;
		return ElapsedTime;

	}

	/********************************************************************************************************
	 * // 16::program WindChill.java //
	 * 
	 * @param temp
	 * @param speed
	 */

	public static void calculate(double temp, double speed) {

		// TODO Auto-generated method stub
		double ress = 0.0;
		if (temp > 50 || speed > 120 || speed < 3) {
			System.out.println("please enter valid values");
		} else {
			ress = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
			System.out.println(ress);
		}
	}

	/*********************************************************************************************************
	 * //II]: ALGORITHM PROGRAM////
	 * 
	 * //1: An Anagram Detection Example
	 */

	public static void anagramm() {
		System.out.println("ENTER THE 1ST STRING=");
		String s1 = s.nextLine();
		System.out.println("ENTER THE 2ND STRING=");
		String s2 = s.nextLine();

		int l1 = s1.length();
		int l2 = s2.length();
		int i = 0;
		int j = 0;

		if (l1 != l2) {
			System.out.println("Length is not equal");
			System.out.println("BOTH STRING ARE NOT ANAGRAM");
		}
		char s11[] = s1.toCharArray();
		char s22[] = s2.toCharArray();

		for (i = 0; i < l1; i++) {
			for (j = i + 1; j < l2; j++) {
				char temp;
				if (s11[i] > s11[j]) {
					temp = s11[i];
					s11[i] = s11[j];
					s11[j] = temp;
				}

				if (s22[i] > s22[j]) {
					temp = s22[i];
					s22[i] = s22[j];
					s22[j] = temp;
				}
			}
		}

		if (s1 != s2) {
			System.out.println("string are not angram");
		} else {
			System.out.println("string are anagram");
		}
	}

	/************************************************************************************************************
	 * //2:binary Search
	 * 
	 * @param a
	 * @param s1
	 * @return
	 */

	public static int binary_search(String a[], String s1) {
		int high = 5;
		int low = 0;
		int mid = 0;

		while (low <= high) {
			mid = (high + low) / 2;

			int res = (a[mid].compareTo(s1));
			if (a[mid].equals(s1))

				return mid;
			else if (res < 0)

				low = mid + 1;

			else

				high = mid - 1;
		}
		return mid;
	}

	/*****************************************************************************************************
	 * //3:Bubble Sort
	 * 
	 * @param a
	 * @param l
	 */
	
	public static void bubbleSort(int[] a, int l) {
		// TODO Auto-generated method stub
		// here we have to use 2 loop
		//
		for (int j = 0; j < l; j++) {
			for (int k = 0; k < l - 1; k++) {
				if (a[k] > a[k + 1]) {
					int t;
					t = a[k];
					a[k] = a[k + 1];
					a[k + 1] = t;
				}
			}
		}
		for (int k = 0; k <= l - 1; k++) {
			System.out.println("sorting integer elements are=" + a[k]);
		}
	}

	/****************************************************************************************
	 * // 4:Insertion Sort
	 * 
	 * @param arr
	 * @param l
	 */

	public static void sort(int arr[], int l) {
		for (int i = 1; i < l; i++) {
			int value = arr[i];// 2 pass to the value
			int j = i - 1;
			while (j >= 0 && arr[j] > value)// 6>2
			{
				arr[j + 1] = arr[j];// move 6
				// at index 1
				j--;

			}
			arr[j + 1] = value;

		}
		for (int i : arr) {
			System.out.println("sorted Array=" + i + ",");
		}

	}

	/***************************************************************************************************
	 * //5:Prime No
	 */

	public static void prime_no() {
		// TODO Auto-generated method stub

		System.out.println("1st value for prime");
		int f = s.nextInt();
		System.out.println("2nd value for prime");
		int l = s.nextInt();
		int i;
		int j;

		for (i = f; i <= l; i++) {
			for (j = 2; j <= l; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println("prime No are:=" + i);

			}
		}

	}

	/************************************************************************************************************
	 * //11::dayOfWeek
	 * 
	 * @param m
	 * @param y
	 * @param d
	 * @return
	 */

	public static int DayOfWeek(int m, int y, int d) {
		// TODO Auto-generated method stub
		int y0, x, m0, d0;
		y0 = y - (14 - m) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		return d0 = (d + x + 31 * m0 / 12) % 7;

	}

	/******************************************************************************************
	 * 
	 * //12::temperaturConversion
	 * 
	 * @param FahrenheitTemp
	 * @return
	 */

	public static double CelsiusTemp(double FahrenheitTemp) {
		// TODO Auto-generated method stub
		return (FahrenheitTemp * 9 / 5) + 35;

	}

	public static double fahrenheit(double fahrenheit) {
		// TODO Auto-generated method stub
		return (fahrenheit - 32) * 5 / 9;

	}

	/******************************************************************************
	 * //13: MonthlyPayment
	 * 
	 * @param pharmonik value n
	 * @param y
	 * @param r
	 * @return
	 */

	public static double MonthlyPayment(double p, double y, double r) {
		// TODO Auto-generated method stub
		double n = 12 * y;
		double r1 = r / (12 * 100);
		double payment = (p * r1) / 1 - Math.pow((1 + r), (-n));

		return payment;
	}

	public static double Sqrt(Double c) {
		// TODO Auto-generated method stub
		
			double epsilon= 1.0e-15;
			double t=c;
			
			while(Math.abs(t-c/t)> epsilon*t)
			{
				t=(c/t+t)/2;
			}
			return t;
		}

	public static void binary(int num)
	{
		int[] bin = new int[100];
		bin[0]=0;
		int i = 0;
		
		while(num>0)
		{
				bin[i++] = num%2;
				num = num/2;
		}
		
		for(int j = i-1 ;j>0;j--)
		{
			System.out.print(bin[j]);
		}
	}
	
	

	static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
	static int total, i;
	static void note(int value)
	{
float no = value/notes[i];
System.out.println(no);
		if(value/notes[i] != 0)
		{
			total += (value/notes[i]);
			System.out.println("total is "+total);
			System.out.println(notes[i]+" is notes "+value/notes[i]);
			value = value % notes[i];
			System.out.println("value is "+value);
		}
		i++;
		if(value == 0)
		{
			System.out.println("Total notes :: "+total);
			return;
		}
		note(value);
	}
}

	


