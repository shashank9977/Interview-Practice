package sorting;

public class bubble_sort {

	public static void main(String[] args) 
	{
	int[] array=new int[]{6,2,3,5,4,1};		
		for(int i=0;i<array.length;i++){		
			int j=0;
		 while(j<array.length-1) {				
			if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;				
			}
			j++;	
		 }
	}
		
		for(int k=0;k<array.length;k++){				
			System.out.println(array[k]);		
		}
}
}
