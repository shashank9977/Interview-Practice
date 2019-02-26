
import java.lang.*;
public class calculatedivisors {

	public static void main(String[] args) 
	{
		 int n;
		   int i=2;
		   System.out.println(n);
		   while(i <= sqrt(n))
		    {
		        if(n%i==0) {
		        	System.out.println(i);
		            if (i != (n / i)) {
		            	System.out.println(n/i);
		            }
		        } 

		        i++;
		    }

	}



}
