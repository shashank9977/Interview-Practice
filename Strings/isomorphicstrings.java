package Strings;
import java.util.HashMap;

public class isomorphicstrings {

	public static void main(String[] args) 
	{
		String str="paper";
		String str2="title";
		
		int i=0;
		int j=0;
		boolean result=true;
		HashMap<Character, Character> map=new HashMap<Character,Character>();	
		if(str.length()!=str2.length())
		{
			result= false;		
		}
		
		while(i<str.length())
		{
			if(!map.containsKey(str.charAt(i)))
			{
					if(map.containsValue(str2.charAt(i)))
				    {
						result= false;					        
					}				
				map.put(str.charAt(i),str2.charAt(i));				
			}
			else
			{
				char tmp=map.get(str.charAt(i));
				if(tmp!=str2.charAt(i))
				{
					result=false;									
				}			
			}
			i++;
		}		
		System.out.println(result);
	}
		
		
	}
