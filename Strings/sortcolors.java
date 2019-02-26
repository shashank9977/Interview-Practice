package Strings;

public class sortcolors {

	static int[] A=new int[]{0,1,0,1,1,0,1,2,1,2,0,1,2};
	static int n=A.length;
	public static void main(String[] args) 
	{	
		 	int j = 0, k = n - 1;
		    for (int i = 0; i <= k; ++i){
		        if (A[i] == 0 && i != j)
		        {
		        	 swap(A[i--], A[j++]);		        	
		        }		           
		        else if (A[i] == 2 && i != k)
		        {
		        	  swap(A[i--], A[k--]);	        	
		        }		        		        
		        for(int j1=0;j1<A.length;j1++)
		        {
		        	System.out.println(A[j1]);		        	
		        }
	}

}

	private static void swap(int i, int j) 
	{
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
		// TODO Auto-generated method stub
		
	}
