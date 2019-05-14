package Stock_4th;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

//import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

//import StockReport.Stock;

public class writetojson {
	//static stock stock1[];
	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		File file1=new File("/home/user/Documents/program/avani/BridglabzJava/src/Stock_4th/Stock_.json");
		File file=new File("home/user/Documents/program/avani/BridglabzJava/src/Stock_4th/Write_4_Stock.json");
		ArrayList<Object> stock2=new ArrayList<>();
		try {
		JsonNode node=mapper.readTree(file1);
		JsonNode node1=node.get("first");
		System.out.println("stock report-----");
		System.out.println();
		for(JsonNode value:node1)
		{
			String name=value.get("name").asText();
			stock2.add(name);
			int number=value.get("number").asInt();
			stock2.add(name);
			int price=value.get("price").asInt();
			stock2.add(price);
			System.out.println("name of stock : "+name);
			System.out.println("numbe : "+number);
			System.out.println("price ; "+price);
			
			long total_p=number*price;
			stock2.add(total_p);
			mapper.writeValue(file1, stock2);
			
		}
		}catch(JsonProcessingException e)
		{
			System.out.println("error accure");
		}
catch(IOException e)
	{
		System.out.println("error accure");
	}
	}

	}


