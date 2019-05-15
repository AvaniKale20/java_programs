package Stock_4th;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Stockmain{
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String file="/home/user/Documents/program/avani/BridglabzJava/src/Stock_4th/Stock.json";
	String file1="/home/user/Documents/program/avani/BridglabzJava/src/Stock_4th/Write_4_Stock.json";
	int totalvalue=0;
	ObjectMapper mapper=new ObjectMapper();

	ArrayList stock=new ArrayList();
	
	try {
		JsonNode node=mapper.readTree(new File(file));
		JsonNode value=node.findPath("stock");
		
		System.out.println("  stock report ");
		System.out.println();
		for (JsonNode nod : value) {
			String stock_name=nod.findPath("name").asText();
			stock.add(stock_name);
			int no_of_stocks=nod.findPath("number").asInt();
			stock.add(no_of_stocks);
			int share_price=nod.findPath("price").asInt();
			stock.add(share_price);
			System.out.println("stock name\t\t:"+stock_name);
			System.out.println("number of shares are\t:"+no_of_stocks);
			System.out.println("each share price\t:"+share_price);
			long total_price=no_of_stocks*share_price;
			stock.add(total_price);
			System.out.println("total prise="+total_price);
			/***********************
			 * we use here writevalue for to print the java object into
			 * json object
			 * 
			 */
			mapper.writeValue(new File(file1),stock);//writeValue(file1, stock);
			
			System.out.println("total price "+stock_name+"\t:"+(no_of_stocks*share_price));
			System.out.println();
			totalvalue+=(no_of_stocks*share_price);
		}
	} catch (JsonProcessingException e) {
		
		System.out.println("error occured during parsing the data from file");
	} catch (IOException e) {
		
		System.out.println("error occured during parsing the data from file");
	}
	System.out.println("--------------------------------------------------------------------------------");
	System.out.println("total value of stock\t"+totalvalue);
}
}