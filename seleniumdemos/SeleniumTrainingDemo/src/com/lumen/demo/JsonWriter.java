package com.lumen.demo;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// First character

	    JSONObject characterDetails = new JSONObject();

	    characterDetails.put("firstName", "Monkey D.");

	    characterDetails.put("lastName", "Luffy");
	    
	    JSONObject characterObject = new JSONObject();

	    characterObject.put("character", characterDetails);
	    
	    // Second character

	    JSONObject characterDetails2 = new JSONObject();

	    characterDetails2.put("firstName", "Rimiru");

	    characterDetails2.put("lastName", "Sama");
	    
	    JSONObject characterObject2 = new JSONObject();

	    characterObject2.put("character", characterDetails2);
	    
	    // Add students to list

	    JSONArray characterList = new JSONArray();

	    characterList.add(characterObject);

	    characterList.add(characterObject2);
	    
	    // Write JSON file

	    try (FileWriter file = new FileWriter("characters_Sep7.json")) {
	    	
	    	file.write(characterList.toJSONString());
	    	
	    	file.flush();
	    	
	    } catch (IOException e) {

	       e.printStackTrace();

	    }

	}

}
