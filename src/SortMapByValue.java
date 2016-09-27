

import java.util.HashMap;
import java.util.TreeMap;

public class SortMapByValue {

	public static void main(String[] args) {
		// To Sort a Map by its Value
		
		// To create a HashMap()
		HashMap<String,Integer> hm = new HashMap<>();
				
		//  put elements to HashMap
		hm.put("Arzaan", 65);
		hm.put("Ram", 80);
		hm.put("Sruthi", 95);
		hm.put("Rima", 70);
		hm.put("Roma", 60);
		hm.put("Max", 55);
		
		// Create TreeMap - stores in ascending order
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.putAll(hm);
		System.out.println(tm);
	}

}
