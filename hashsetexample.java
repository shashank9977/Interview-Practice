import java.util.HashSet;

public class hashsetexample {
	//hashset doesnt take duplicates
	public static void main(String[] args) 
	{
		int[] nums=new int[]{1,2,2,1};
		int[] nums2 =new int[]{1,2};
		HashSet<Integer> set=new HashSet<Integer>();
		HashSet<Integer> intersect=new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			set.add(nums[i]);			
		}
		
		for(int i=0;i<nums2.length;i++)
		{
			if(set.contains(nums2[i]))
			{
					intersect.add(nums2[i]);
			}			
		}
		
		int[] result=new int[intersect.size()];
		int k=0;
		for(Integer num:intersect)
		{
			result[k++]=num;
			
		}
		
		System.out.println(result);
		
		
		

	}

}
