package sorting;

public class countingsort {

	public static void main(String[] args) 
	{
		char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'
               };		
		char[] output=new char[arr.length];
		int[] count=new int[256];
		for(int i=0;i<256;i++){
				
			count[i]=0;			
		}
		for(int i=0;i<arr.length;i++){
			
			count[arr[i]]++; //count the number of each characters					
		}	
		for(int i=1;i<count.length;i++){
				
			count[i]+=count[i-1];				
		}		
		for(int i=0;i<arr.length;i++){			
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;					
		}
		for(int i=0;i<output.length;i++){	
			
			System.out.println(output[i]);	
		}	
	}

}
