package Stock_4th;

//package Stock_4th;

//package Com.Bridge.Oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

//import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

//import StockReport.Stock;

public class writetojson {
	static stock stock1[];
	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		File file1=new File("/home/user/Documents/program/avani/BridglabzJava/src/Stock_4th/Stock_.json");
		File file=new File("home/user/Documents/program/avani/BridglabzJava/src/Stock_4th/Write_4_Stock.json");
		ArrayList<stock> stock2=new ArrayList<stock>();
		JsonNode node=mapper.readTree(file1);
		JsonNode node1=node.get("first");
		stock1=mapper.readValue(node1, stock[].class);
		for(stock stock3:stock1)
		{
			stock2.add(stock3);
		}
		mapper.writeValue(file, stock2);
		
		
		
	}

}

