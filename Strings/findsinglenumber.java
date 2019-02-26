package Strings;

public class findsinglenumber 
{
// find the single number among other pairs, we use XOR 	
	public static void main(String[] args) 
	{
		int[] nums=new int[]{1,2,3,3,2};
		int ans=0;
		for(int i=0;i<nums.length;i++)
		{
			ans=ans^nums[i];
			
		}
		
		System.out.println(ans);
	}

}
