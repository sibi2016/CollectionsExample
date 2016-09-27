

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment5d {

	public static void main(String[] args) {
		// To demonstrate HashMap methods.
		
		// To create a HashMap()
		HashMap<String,Integer> hm = new HashMap<>();
		
		//  put elements to HashMap
		hm.put("Arzaan", 65);
		hm.put("Ram", 80);
		hm.put("Sruthi", 95);
		hm.put("Rima", 70);
		hm.put("Roma", 60);
		hm.put("Max", 55);
		
		// Printing the Key and Value pairs
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		// To search a key and returning its value
		// Returns the value corresponding to the key "Ram"
		System.out.println(hm.get("Ram"));
		
		
		
	}

}
