

public class Assignment5c {

	public static void main(String[] args) {
		// input series - a1,a2,a3,a4,b1,b2,b3,b4 and print as a1,b1,a2,b2,a3,b3,a4,b4
		int m[] = {10,30,50,70,20,40,60,80};
		int n = (m.length - 1);
	    int i = 1;
	    for (int start = 1; start < n; start++) {
	        int temp = m[start];
	        m[start] = m[n / 2 + i];

	        for (int j = (n / 2 + i); j > start; j--) {
	            m[j] = m[j - 1];
	        }

	        start++;
	        m[start] = temp;
	        i++;
	    }
	    for (int c : m)
	    {
	    	System.out.print(c+" ");
	    }
	}

}
