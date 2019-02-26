
public class thirdmax 
{
	public static void main(String[] args) 
	{
		int[] nums=new int[]{2,7,9,10};
		Object max=null;
		Object max2=null;
		Object max3=null;
		for(int i=0;i<nums.length;i++)
		{
			if(max==null || nums[i]>(int)max)
			{
				max3=max2;
				max2=max;
				max=nums[i];
			}
			else if(max2==null || nums[i]>(int)max2)
			{
				max3=max2;
				max2=nums[i];				
			}
			else if(max3==null || nums[i]>(int)max3)
			{
				max3=nums[i];				
			}		
		}		
		System.out.println(max3);
	}

}
