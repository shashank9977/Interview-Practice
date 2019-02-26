
public class removeduplicatesfromarray {

	public static void main(String[] args) 
	{
		
		
		int[] nums=new int[]{2,3,3,3,4,5,5,6};		
		int j=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=nums[j])
			{
				nums[j++]=nums[i];								
			}			
		}
		
		System.out.println(j);
		
		

	}

}
