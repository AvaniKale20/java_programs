package Com.Bridge.Oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Inventory_details {
	
	static Meal meal[];
	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("/home/user/Documents/program/avani/BridglabzJava/src/Com/Bridge/Oops/Meal.json");
		JsonNode node=mapper.readTree(file);
		JsonNode node1=node.get("rice");
		meal=mapper.readValue(node1, Meal[].class);
		System.out.println("Rice::=====");
		System.out.println();
		for(Meal meal1:meal)
		{
			System.out.println(meal1);
		}
		System.out.println();
		System.out.println("pulses::====");
		System.out.println();
		node1=node.get("pulses");
		meal=mapper.readValue(node1, Meal[].class);
		for(Meal pulses:meal)
		{
			System.out.println(pulses);
		}
		System.out.println();
		System.out.println("Wheat::====");
		System.out.println();
		node1=node.get("wheat");
		meal=mapper.readValue(node1, Meal[].class);
		for(Meal wheats:meal)
		{
			System.out.println(wheats);
		}
		
	}

}