package Cmd;

import java.util.Scanner;


public class RunStock {

	public static void main(String[] args) {
		boolean value=true;
		while(value)
		{
		System.out.println();
		System.out.println("select the Options....\n 1 > Add Customer Detail \n 2 > Add Company Info & Share \n 3 > Sell Share \n 4 > Buy Share \n 5 > Check Value Of Share \n 6 > Print Customer And Share Detail \n 7 > Exit  ");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Choice....");
		int c=in.nextInt();
		int i=0;
	
		
		switch(c) {
		case 1: System.out.println("The Customer Detail Add System...");
				StockAccount.add();
				break;
		case 2: System.out.println("The Company Shares Panel......");
				StockAccount.addCompany();
				break;
		case 3: System.out.println("the Seller Panel... ");
			
				System.out.println("Enter the shares");
				int shares1 = in.nextInt();
				System.out.println("Enter the Symbol");
				String symbol1 = in.next().toUpperCase();
				BuyyerAndSeller.sell(shares1, symbol1);
				break;
		case 4: System.out.println("The Buyer Panel... ");
				System.out.println("Enter the shares");
				int shares = in.nextInt();
				System.out.println("Enter the Symbol");
				String symbol = in.next().toUpperCase();
				BuyyerAndSeller.buy(shares, symbol);
		        break;		
		case 5: System.out.println("The Check Value Of Share....");
				double totalValue = StockAccount.valueOf();
				if(totalValue >= 0)
				{
					System.out.println(totalValue);
				}
				break;	
		case 6: System.out.println("The All Customer And Share Penale....");
				StockAccount.printReport();
				break;
		case 7: System.out.println();
		System.out.println();
		value = false;
		break;
		default:System.out.println("Please Select Right Option....");
		}

		}
}
}
