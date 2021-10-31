package com.josue;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadAndParse {

	public static void main(String[] args) throws IOException, ParseException {
		// List for the all the samples
		List<SampleModel> samples = new ArrayList<SampleModel>();
		
		// Reading the file and parsing to an Object
		FileReader myfile = new FileReader("./src/sample.json");
		Object myobj = new JSONParser().parse(myfile);
		
		// Separating each element from the Object
		JSONArray entries = (JSONArray) myobj;
		
		// Iterating the array, would be better with For, using While to practice
		int count = 0;
		while (count < entries.size()) {
			JSONObject jo = (JSONObject) entries.get(count);
			// Attributes from Json
			String name = (String) jo.get("name");
			String lastName = (String) jo.get("lastName");
			long age = (long) jo.get("age");
			// Instancing the sample
			SampleModel sample = new SampleModel(name, lastName, age);
			sample.showAll();
			// Saving on list
			samples.add(sample);
			count++;
		}
		
	}

}
