import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;

public class findmissinginarray {

	public static void main(String[] args) {
		
		int[] nums=new int[]{4,3,2,7,8,2,3,5};
		 List<Integer> ret = new ArrayList<Integer>();
	        
	        for(int i = 0; i < nums.length; i++) 
	        {
	            int val = nums[i] - 1;
	            if(nums[val] > 0) 
	            {
	                nums[val] = -nums[val];
	            }
	        }
	        
	        for(int i = 0; i < nums.length; i++) 
	        {
	            if(nums[i] > 0) 
	            {
	                //ret.add(i+1);
	                System.out.println(i+1);
	            }
	        }
	}

}
