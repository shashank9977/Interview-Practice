package sorting;

public class quicksort {

	public static void main(String[] args) 
	{
		int[] array=new int[]{8,9,4,3,10,1};
		int low=0;
		int high=array.length-1;
		sort(array,low,high);	
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);	
		}
	}

	private static void sort(int[] array, int low, int high) 
	{	
		if(low<high)
		{
			// pi is the partition from which we can seperate the array into two different parts.
			int pi=partition(array,low,high);
			sort(array,low,pi-1);
			sort(array, pi+1,high);			
		}	
	}

	private static int partition(int[] array, int low, int high) 
	{	
		int i=low-1;
		int pivot=array[high];
		for(int j=low;j<high;j++)
		{
			if(array[j]<=pivot) //comparing each element with the pivot element and then the lesser elements than pivot are added to the leftmost side of the array.
			{
				i++; // for positioning the least element in the array.(the position in which the element will be placed.
				swap(array,i,j);// swapping the lesser element than pivot in the corresponding position. 			
			}
		}
		swap(array,i+1,high); // swap here because it signifies all the remaining elements which are not swapped are greater than pivot.
		return i+1;  // return that position.
	}

	private static void swap(int[] array, int i, int j) 
	{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;		
	}

}
