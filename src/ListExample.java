import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
	
	public static void createArrayList()
	{
		
		//Creating a list and adding elements to it.
		List <String> list = new ArrayList();
		list.add("Max");
		list.add("Robert");
		list.add("Tom");
		list.add("Max");
		list.add("Dixon"); 
		
		//Printing the list using Iterator.
		Iterator i = list.iterator();
		
		System.out.println("Printing using Iterator");
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		System.out.println("");
		
		// Using ListIterator to print the list in reverse order.
		System.out.println("Printing in reverse order");
		ListIterator<String> li = list.listIterator(list.size());
		while (li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		System.out.println("");
		//search for an element in a list
		int count = 0;
		for(String obj : list)
		{
			if(obj.contains("Robert"))
			{
				System.out.println("The searching element is in the list");
				count = count + 1;
			}
		}
			if(count == 0)
			{
			System.out.println("The searching element is not in the list");
			}
		
	}
	
	public static void main(String[] args)
	{
		//Assignment 5a
		System.out.println("ASSIGNMENT 5a");
		System.out.println("");
		createArrayList();
		
	}

}
