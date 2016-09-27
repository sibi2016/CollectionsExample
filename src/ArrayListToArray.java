

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		// To copy an ArrayList to an array
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Ruby");
		arrList.add("Max");
		arrList.add("Sam");
		arrList.add("Joe");
		arrList.add("Jay");
		Iterator it = arrList.listIterator();
		System.out.println("Iterating through ArrayList");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// Copying Arraylist to array
		String[] array = new String[5];
		arrList.toArray(array);
		System.out.println("Iterating through Array");
		for(String str : array)
		{
			System.out.println(str);
		}
	}

}
