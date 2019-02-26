
public class fizzbuzz {

	public static void main(String[] args) 
	{
			int n=20;
			for(int i=0;i<n;i++)
			{
				
				if(i%15==0)
				{
					System.out.println("fizzbuzz");					
				}
				
				else if(i%3==0)
				{
					System.out.println("fizz");
					
				}
				else if(i%5==0)
				{
					System.out.println("buzz");
					
				}
				else
				{
					System.out.println(i);
				}
				
			}
			
			
			
		}

}
