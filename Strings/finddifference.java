package Strings;

public class finddifference {

	public static void main(String[] args) 
	{
		String s="abcd";
		String t="abcde";
			
		int chars=0;
		
		chars=t.charAt(s.length());		
	for(int i=0;i<s.length();i++){		
		chars-=(int)s.charAt(i);
		chars+=(int)t.charAt(i);
	}			
	
	System.out.println((char)chars);
				
		
		

	}

}
