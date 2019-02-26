
public class maxsubarrayproduct {

	public static void main(String[] args) 
	{
		int[] nums=new int[]{1,2,3,4,5};
		 int prev_max_prod=nums[0];
	        int prev_min_prod=nums[0];
	        int ans=nums[0];
	        for(int i=1;i<nums.length;i++)
	        {
	           int  curr_max_prod=Math.max(Math.max(prev_max_prod*nums[i],prev_min_prod*nums[i]),nums[i]);
	           int  curr_min_prod=Math.min(Math.min(prev_max_prod*nums[i],prev_min_prod*nums[i]),nums[i]);
	            
	             ans=Math.max(ans,curr_max_prod);
	             prev_max_prod=curr_max_prod;
	             prev_min_prod=curr_min_prod;	            
	        }
	        return ans;

	}

}
