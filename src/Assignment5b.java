import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;




public class Assignment5b {
	
	public static void methodSet()
	{
		Set s = new HashSet();
		s.add("abc");
		s.add("xyz");
		s.add("sibi");
		s.add("hi");
		
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodSet();
	}

}
