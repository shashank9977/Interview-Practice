package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//use debugger

public class subsets {

	public static void main(String[] args) {
		
		int[] nums=new int[]{2,3,4,5,6};
		List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, 0);
	    
	}

	private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	    list.add(new ArrayList<>(tempList));
	    for(List<Integer> lst :list)
        {
	    	for(int a: lst)
	    	{
	    		System.out.print(a);	
	    	}      	
        }
	    list.clear();
        System.out.println();
	    	    
	    for(int i = start; i < nums.length; i++){
	        tempList.add(nums[i]);
	        backtrack(list, tempList, nums, i + 1);
	        tempList.remove(tempList.size() - 1);              
	    }

}
}
