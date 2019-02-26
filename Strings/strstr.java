package Strings;

public class strstr {
//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		findneedle("nk","shashank");
	}

	private static void findneedle(String needle, String haystack) 
	{
		System.out.println(haystack.indexOf(needle));		
		
	}
	
	

}
