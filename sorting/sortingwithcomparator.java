package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class stringcomparator implements Comparator<String>{
	@Override
	public int compare(String x, String y) {
		// TODO Auto-generated method stub
		
		int xlen=x.length();
		int ylen=y.length();
		
		if(xlen>ylen) return 1;
		else if(xlen<ylen) return -1;	
		else  return x.compareTo(y);
		  
	}
}
 
public class sortingwithcomparator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://www.hackerrank.com/challenges/big-sorting
		
	//String[] array=new String[]{"6","2","3","5","4","1"};	
		String[] array=new String[]{	
		"31415926535897932384626433832795",
		"1",
		"3",
		"10",
		"3",
		"5"};
		
		Arrays.sort(array, new stringcomparator());			
		for(int i=0;i<array.length;i++){		
			
			System.out.println(array[i]);						
		}
	}

}
