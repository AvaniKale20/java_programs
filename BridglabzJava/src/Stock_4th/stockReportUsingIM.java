package Stock_4th;



//package InventoryManagement4;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class stockReportUsingIM {
	
	public static void main(String[] args) {
		stock stock1[];
		double price=0;
		int numberOfshare=0;
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("/home/user/Documents/program/avani/BridglabzJava/src/Stock_4th/Stock_.json");
		File file1=new File("home/user/Documents/program/avani/BridglabzJava/src/Stock_4th/Write_4_Stock.json");
		try 
		{
			JsonNode node=mapper.readTree(file);
			JsonNode node1=null;
			
			System.out.println("*******************Idea************");
			node1=node.get("first");
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock2:stock1)
			{
			System.out.println(stock2);
			price=price+stock2.getPrice();
			numberOfshare+=stock2.getNumber();
			}
			System.out.println("");
			System.out.println("****************vodafone*********************");
			
			node1=node.get("second");
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("****************JIO*********************");
			node1=node.get("third");
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("****************Airtel*********************");
			node1=node.get("fourth");
			stock1=mapper.readValue(node1, stock[].class);
			for(stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("Total Price :"+price);
			System.out.println("Total number of share :"+numberOfshare);
			
			for(stock stock2:stock1)
			{
				String jsonres="";
				jsonres=mapper.writeValueAsString(stock2);
			mapper.writeValue(file1, stock2);
			System.out.println(stock2);
			}
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
		
	}

}
