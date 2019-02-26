package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public static void main(String[] args) 
	{
		GenerateParenthesis pn=new GenerateParenthesis();
		int n=3;		
		List<String> list=new ArrayList<String>();
		pn.Generate(list,"",0,0,n);	
	}

	private static void Generate(List<String> list, String str, int open, int close, int max) 
	{
		if(str.length()==max*2)
		{
			list.add(str);			
			System.out.println(str);
			return ;
		}
		if(open<max)
		{	
			Generate(list,str+"(",open+1,close,max);		
		}
		if(close<open)
		{			
			Generate(list,str+")",open,close+1,max);
		}		
	}

}
