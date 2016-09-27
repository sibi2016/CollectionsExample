

import java.time.Month;

public class EnumEx {
	
	// To demonstrate Enum 
	//declare months of the year 
	enum months
	{
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER,DECEMBER
		
	}

	public static void main(String[] args)
	{
		// Printing enum elements
		for(months month : months.values())
		{
			System.out.print(month+" ");
		}
		
	}
}
