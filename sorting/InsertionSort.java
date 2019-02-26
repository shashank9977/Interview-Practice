package sorting;

public class InsertionSort {
//http://www.geeksforgeeks.org/insertion-sort/
	public static void main(String[] args) 
	{
		 int arr[] = {12, 11, 13, 5, 6};
		 
		 for(int i=1;i<arr.length;i++){
			 
			 int key=arr[i];
			 int j=i-1;			 // it depends on the concept that all the previous elements are sorted.
			while(j>=0 && arr[j]>key){
				
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				 j=j-1;				 
			 }		 
		 }
		 
		
		 for(int k=0;k<arr.length;k++){	
				
				System.out.println(arr[k]);		
			}
		
		
		
		

	}

}
