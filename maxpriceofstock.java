
public class maxpriceofstock {

	public static void main(String[] args) 
	{
		int[] nums=new int[]{7,1,5,3,6,4};
		if(nums.length==0)
		{
			return ;			
		}		
		int min_so_far=nums[0];
		int max=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>min_so_far)
			{
				max=Math.max(max, nums[i]-min_so_far);				
			}
			else
			{
				min_so_far=nums[i];				
			}		
		}
		System.out.println(max);
	}

}
