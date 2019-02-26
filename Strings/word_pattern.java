package Strings;
import java.util.HashMap;

public class word_pattern {

	public static void main(String[] args) 
	{
		
		String str="abba";
		String[] nums=new String[]{"dog","cat","cat","dog"};
		
		int i=0;
		int j=0;
		boolean result=true;
		HashMap<String, Character> map=new HashMap<String,Character>();
		
		if(str.length()!=nums.length)
		{
			result= false;
		
		}
		
		while(i<nums.length)
		{
			if(!map.containsKey(nums[i]))
			{
				 if(map.containsValue(pattern.charAt(i))
						    {
						        return false;
						        
						    }
				
				map.put(nums[i],str.charAt(i));				
			}
			else
			{
				char tmp=map.get(nums[i]);
				if(tmp!=str.charAt(i))
				{
					result=false;									
				}			
			}
			i++;
		}		
		System.out.println(result);
	}

}
