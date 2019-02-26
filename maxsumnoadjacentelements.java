
public class maxsumnoadjacentelements {

	public static void main(String[] args) 
	{
		int[] sums=new int[]{6,2,3,7,9,10};
			
		int[] M=new int[sums.length];
		M[0]=sums[0];
		M[1]=sums[1];
		int max=sums[0];
		for(int i=2;i<sums.length;i++)
		{
			M[i]=Math.max(M[i-1], M[i-2]+sums[i]);
			System.out.println(M[i]);
		}		
		System.out.println(max);		
	}

}
