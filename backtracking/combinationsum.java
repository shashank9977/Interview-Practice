package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class combinationsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array=new int[]{4,5,3,10,9,2,1};
		int target=7;
		Arrays.sort(array);
		List<List<Integer>> biglist=new ArrayList<List<Integer>>();
		List<Integer> smllist=new ArrayList<Integer>();
		Recurse(target,array,biglist,smllist,0);	
	}

	private static void Recurse(int target, int[] array, List<List<Integer>> biglist , List<Integer> smllist, int start) {
		
		if(target<0)
		{
			return;	
		}		
		else if(target>0)
		{
		for(int i=start;i<array.length;i++)
		{						
				smllist.add(array[i]);
				Recurse(target-array[i],array,biglist,smllist,i+1);	
				smllist.remove(smllist.size()-1);
		}
		}
		else 
		{
			for(Integer i :smllist)
			{
				System.out.print(i);
		
			}
			System.out.println();
			biglist.add(new ArrayList<Integer>(smllist));				
		}
		}
		
		
		
	

}
