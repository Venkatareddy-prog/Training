package com.collection.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEg {
public static void main(String[] args) {
	Map<String, String> hmss= new HashMap<>();
	hmss.put("Telangana", "Hyderabad");
	hmss.put("Andhra", "Vizag");
	hmss.put("Karnataka", "Banglore");
	
	Set<Entry<String, String>> sess=hmss.entrySet();
	
	Iterator<Entry<String, String>> iss= sess.iterator();
	// uisng while loop
	while(iss.hasNext()) {
		Entry<String, String> ess= iss.next();
		System.out.println(ess.getKey()+"->"+ess.getValue());
	}
	
	// using foreach/enhanced for loop
	for (Entry<String, String> entry : sess) {
		System.out.println(entry.getKey()+"->"+entry.getValue());
		
	}
}

}
