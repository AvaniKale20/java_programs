package Com.Bridge.Oops;

import java.io.File;
import java.io.IOException;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.type.TypeReference;
//import Json_Programs.Utility;

public class StockMain {
	public static void main(String[] args) throws IOException, JsonMappingException, JsonParseException {
		ObjectMapper obj = new ObjectMapper();

//		Scanner sc = new Scanner(System.in);
		String path = ("/home/user/Documents/program/avani/BridglabzJava/src/Com/Bridge/Oops/ThirdProgram.json");
		File file = new File(path);

		try {
			JsonNode jsonnode = obj.readTree(file);
			JsonNode detail = jsonnode.get("Stock");

			for (JsonNode node : detail) {

				String name = node.path("Stock_Name").asText();
				int share = node.path("Number_of_Share").asInt();
				int price = node.path("Share_Price").asInt();

				System.out.println("name of the stocks : " + name);
				System.out.println("Number of shares : " + share);
				System.out.println("Price of the share : " + price);
				int total = share * price;

				System.out.println("total is" + total);

				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
