package com.collection.examples;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEg {
public static void main(String[] args) {
	Comparator<String>  cc= new Comparator<>() {

		@Override
		public int compare(String o1, String o2) {
			
			return o2.compareTo(o1);
		}

		
	};
	Map<String, String> hmss= new TreeMap<>(cc);
	hmss.put("karnataka", "andhra");
	hmss.put("Andhra", "Vizag");
	hmss.put("madhya", "andhra");
	System.out.println(hmss);
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
