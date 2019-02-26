
public class Example3 {

	public static void main(String[] args) 
	{
		
		Example3 ex=new Example3();
		int x=ex.solution(5,8);
		
		System.out.println(x);
		
		// TODO Auto-generated method stub

	}

	private static int solution(int M, int N) 
	{
			int ans=0;
       // int len=M-N;
			if(M<=N)
	        {
	          // int mid=(M+N)/2;
	            
	           ans= solution(M,(((M+N)/2)-1))^((M+N)/2)^solution((((M+N)/2)+1),N);
	                         
	        }

			
		return ans;
       
		

		
	}

}
