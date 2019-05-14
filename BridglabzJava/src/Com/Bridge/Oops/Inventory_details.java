package Com.Bridge.Oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Inventory_details {
	
	static Meal meal[];
	public static void main(String[] args) throws JsonProcessingException, IOException {
		// objectMapper is class which is present in jackson library
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("/home/user/Documents/program/avani/BridglabzJava/src/Com/Bridge/Oops/Meal.json");
		/***********************
		 * Create a tree from JsonNode- JsonNode node=mapper.readTree();
		 * we use node to traverse the tree
		 */
		JsonNode node=mapper.readTree(file);
		JsonNode node1=node.get("rice");
		/***************************
		 * conversion of Json Format in to java Object
		 * in Meal class all setter getter are present and in node1 rice json information are present
		 * Pojo use to conversion of json data into java object
		 */
		meal=mapper.readValue(node1, Meal[].class);
		System.out.println("Rice::=====");
		System.out.println("rice info");
		System.out.println();
		for(Meal meal1:meal)
		{
		String name=meal1.getName();
		double price=meal1.getPrice();
		double weight=meal1.getWeight();
		System.out.println("name="+name);
		//System.out.println();
		System.out.println("price="+price);
	//	System.out.println();
		System.out.println("weight="+weight);
		System.out.println("total="+weight*price);
		System.out.println();
		}
		
		System.out.println();
		System.out.println("pulses::====");
		System.out.println("pulses info");
		System.out.println();
		node1=node.get("pulses");
		meal=mapper.readValue(node1, Meal[].class);
		for(Meal pulses:meal)
		{
			String name=pulses.getName();
			double price=pulses.getPrice();
			double weight=pulses.getWeight();
			System.out.println("name="+name);
			//System.out.println();
			System.out.println("price="+price);
			//System.out.println();
			System.out.println("weight="+weight);
			System.out.println("total="+weight*price);
			System.out.println();
		}
		System.out.println();
		System.out.println("Wheat::====");
		System.out.println("wheat info");
		System.out.println();
		node1=node.get("wheat");
		meal=mapper.readValue(node1, Meal[].class);
		for(Meal wheats:meal)
		{
			String name=wheats.getName();
			double price=wheats.getPrice();
			double weight=wheats.getWeight();
			System.out.println("name="+name);
			//System.out.println();
			System.out.println("price="+price);
			//System.out.println();
			System.out.println("weight="+weight);
			System.out.println("total="+weight*price);
			System.out.println();
		}
		
	}

}