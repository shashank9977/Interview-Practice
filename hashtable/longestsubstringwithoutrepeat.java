package hashtable;

import java.util.HashSet;
import java.util.Iterator;

public class longestsubstringwithoutrepeat {

	public static void main(String[] args) 
	{
		
		int i=0; int j=0;
		String str="pwwkew";
		int max=0;
		HashSet<Character> set=new HashSet<Character>();
		while(j<str.length())
		{
			if(!set.contains(str.charAt(j)))
			{
				set.add(str.charAt(j++));
				max=Math.max(max, set.size());
				j++;				
			}
			else
			{
				set.remove(str.charAt(i++));				
			}			
		}
	System.out.println(max);
		
	}
}
