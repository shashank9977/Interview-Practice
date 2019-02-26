import java.util.HashMap;

public class twosum {

	public static void main(String[] args) 
	{
		int[] nums=new int[]{2,7,9,10};
		HashMap<Integer,Integer> mp=new HashMap<Integer, Integer>();
		int target=9;
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++)
		{
			if(mp.containsKey(target-nums[i]))
			{	
				result[1]=i;
				result[0]=mp.get(target-nums[i]);				
			}			
			mp.put(nums[i], i);
		}
	
		
			System.out.println(result[0]+"  "+result[1]);
			
		
	   
		///	System.out.println(a+b);
		
		
		
	}

}
