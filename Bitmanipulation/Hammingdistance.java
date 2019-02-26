package Bitmanipulation;

public class Hammingdistance {

	public static void main(String[] args) 
	{
		int x=1; 
		int y=16;
		 int xor = x ^ y;	 
				int  count = 0;
				
		System.out.println(xor);		
		    for (int i=0;i<32;i++) {
		    	count += (xor >> i) & 1;   
		 
	
		}
		    System.out.println(count);

}
}
