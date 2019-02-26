
public class powerof2 
{
	public static void main(String[] args) 
	{		
		int n=Math.abs(-2147483648);
		
		String x=Integer.toBinaryString(n);
		System.out.println(x);
		
        int n1=Integer.bitCount(n);
        System.out.println(n1);
        
        if(n1==1)
        {
            System.out.println( true);
            
        }
        else
        {
        	
        	System.out.println(false);
        }

   
	}

}
