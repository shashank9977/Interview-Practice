package Strings;

import java.util.Arrays;

public class longestcommonprefix {

	public static void main(String[] args) 
	{
		StringBuilder result = new StringBuilder();
		String[] strs=new String[]{"shshank","shark","shamblesfdsfdsf","shame"};
		
		Arrays.sort(strs);
		
		for(String s:strs)
		{
			System.out.println(s);			
		}
		
		 char [] a = strs[0].toCharArray();
         char [] b = strs[strs.length-1].toCharArray();
         
         for (int i = 0; i < a.length; i ++){
             if (b.length > i && b[i] == a[i])
             {
                 result.append(b[i]);
             }
             else 
             {
                 System.out.println(result.toString());
             }
         }
		
		
	}

}
