
public class Math {

	public static void main(String[] args) 
	{
		sqrt(64);
	}

	private static void sqrt(int x) 
	{
		int start=0;
		int end=x;
		int ans=0;
		while(start<=end)
		{	
			int mid=(start+end)/2;			
			if(mid*mid<x)
			{
				start=mid+1;
				//ans=mid;
			}
			else if(mid*mid>x)
			{
				end=mid-1;								
			}
			else
			{
				ans=mid;
				break;
			}			
		}		
		System.out.println(ans);		
	}

}
