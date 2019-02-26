package Bitmanipulation;

public class Reversebits {

	public static void main(String[] args) 
	{
//		Reverse bits of a given 32 bits unsigned integer.
//		For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), 
//     return 964176192 (represented in binary as 00111001011110000010100101000000).
		
		 int result=0;
		 int n=43261596;
		 for(int i=0; i<32; i++)
		 {
			 result = (result<<1) + (n>>i &1);  //first anding each bit and then shift it to the left,so that  next and operation could be added to the result to the rightmost element.
			 //ex  number 10 
			 //1.0&1=0 operation
			 //2.00 shift operation to left.
			 //3.1&1=1 operation ->00+1=01 adding to previous result
			 //4.010 shifting to left.			 
			// System.out.print((n>>i &1));
			// result +=  (n>>i &1);	
//			 result +=(result<<1);
		 }
		 
		 //System.out.println(result);
	            

	}

}
