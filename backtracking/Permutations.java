package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

	public static void main(String[] args) 
	{
		
		int[] nums=new int[]{2,3,4};
		List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums);
		

	}

	private static void backtrack(List<List<Integer>> list, List<Integer> List, int[] nums) 
	{
		if(List.size()==nums.length)
		{
			list.add(new ArrayList<Integer>(List));				
			for(List<Integer> lst:list)
			{
				for(int i :lst)
				{
					System.out.print(i);			
				}
				System.out.println();				
			}
			list.clear();			
		}
		else
		{
			for(int i=0;i<nums.length;i++)
			{		
				if(!List.contains(nums[i]))
				{
					List.add(nums[i]);
					backtrack(list,List,nums);
					List.remove(List.size()-1);									
				}
			}
		}
		
		
		
	}

}
