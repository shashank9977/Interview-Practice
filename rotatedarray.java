
public class rotatedarray {

	public static void main(String[] args) 
	{
		int d=2;
		int[] array=new int[]{1,2,3,4,5,6,7};
		//rotatearray(array,d);		
		rotatearray2(array,d, array.length-1); //O(n) no extra space
		
	}

	private static void rotatearray2(int[] array, int d, int len)	
	{		
		reverse(array,0,d-1);
		reverse(array,d,len);
		reverse(array,0,len);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);			
		}	
	}

	private static void reverse(int[] array,int start, int end) 
	{
		while(start<=end)
		{
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		
	}

	private static void rotatearray(int[] array ,int d) //O(n) time  O(d) space
	{		
		int i=0;	
		int k=0;
		int[] tmp=new int[d];
		while(i<array.length)
		{
			if(i<d)
			{
				tmp[k]=	array[i];
				k++;
			}
			else
			{				
				int temp=array[i];
				array[i]=array[i-d];
				array[i-d]=temp;																				
			}
			i++;
		}				
		 i=0;
		for(int j=array.length-(d);j<array.length;j++)
		{
			array[j]=tmp[i];
			i++;						
		}		
		for(int n=0;n<array.length;n++)
		{
			System.out.println(array[n]);
			
		}		
	}

}
