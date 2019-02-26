package Bitmanipulation;
//Given an array of integers, every element appears twice except for one. Find that single one.
public class singlenumber {

	public static void main(String[] args){
		int A[]=new int[]{1,4,3,2,1,3,4};
		   int result = 0;
		    for (int i = 0; i<A.length; i++) // XOR-ing a number X twice with any value Y leaves that original value unchanged	    	
//		    	Y ^ 0 = Y
//
//		    	X ^ X ^ Y = Y
		    {
				result =result ^ A[i];
				System.out.println(result);
		    }			
		    System.out.println(result);
		
	}
}
