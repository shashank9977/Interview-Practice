package Strings;

import java.util.HashSet;

public class lenofpalindrome {

	public static void main(String[] args) 
	{
		String a="abccccba";
		int count=0;
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<a.length();i++)
		{
			if(set.contains(a.charAt(i)))
			{
				set.remove(a.charAt(i));
				count++;				
			}
			else
			{
				set.add(a.charAt(i));				
			}	
		}
		
		if(!set.isEmpty())
		{			
			System.out.println((count*2)+1);
		}
		else
		{
			System.out.println(count*2);
		}
	}

}
