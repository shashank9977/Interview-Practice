
public class Move_zeroes {
	
	public static void main(String[] args) 	
	{	
			int[] nums=new int[]{0,1,0,3,12};			
			int j=0;
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]!=0)
				{
					nums[j++]=nums[i];					
				}	
			}
			while(j<nums.length)
			{
				nums[j++]=0;				
			}			
			for(int i=0;i<nums.length;i++)
			{
				System.out.println(nums[i]);
				
			}

	}


}
