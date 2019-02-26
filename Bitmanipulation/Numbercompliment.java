package Bitmanipulation;

public class Numbercompliment {

	public static void main(String[] args) {
		
		int i=0;
		int j=0;		
		
		//00110, its complement is 011001, the sum is 111111. So we only need get the min number 
		//large or equal to num, then do substraction
		
		int num=5;
		while(i<num){
							
			i+=Math.pow(2,j);
			j++;
		}
		
		System.out.println(i-num);

	}

}
