package backtracking;

import java.util.ArrayList;
import java.util.List;

//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
//For example,
//If n = 4 and k = 2, a solution is:

public class combinations2 {

	public static void main(String[] args)
	{
		combinations2 combo=new combinations2();
		int n =4;
		int k=2;
		
		List<Integer> list=new ArrayList<Integer>();
		List<List<Integer>> arlist=new ArrayList<List<Integer>>();
		combo.Recurse(list, arlist,n,k, 1);	
	}

	private void Recurse(List<Integer> list, List<List<Integer>> llist, int n, int k, int start) 
	{		
		if(list.size()==k)
		{
			llist.add(new ArrayList<Integer>(list));			
			for(List<Integer> lst:llist)
			{			
				for(int i :lst)
				{
					System.out.print(i);			
				}
				System.out.println();				
			}
			llist.clear();
		//return;
		}
		else
		{
			for(int i=start;i<=n;i++)
			{
				list.add(i);
				Recurse(list,llist,n,k,i+1);	
				list.remove(list.size()-1);
			}
		}		
	}
}
