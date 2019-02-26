package Bitmanipulation;

public class countbits {

	public static void main(String[] args) 
	{
		
	int n=00000000000000000000000000001011;
			
	
		int count=0;
		for(int i=0;i<32;i++){
			
			if((1&n)==1){
				
				count++; // count the bits
			}
			n=n>>>1; // looping through the next bit by right shifting.
		}
		
		System.out.println(count);
		
		// TODO Auto-generated method stub

	}

}
