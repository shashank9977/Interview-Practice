package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class quicksortprinting {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>();
       for(int i=0;i<n;i++){            
           list.add(sc.nextInt());           
       }      
      quicksort(list);       
   }
   
    
public static ArrayList<Integer> quicksort(ArrayList<Integer> list){
       
	  if(list.size()<0) return null;
       int pivot=list.get(0);
       ArrayList<Integer>leftarray=new ArrayList<Integer>();
       ArrayList<Integer>rightarray=new ArrayList<Integer>();
       ArrayList<Integer>temp=new ArrayList<Integer>();
       for(int i=1;i<list.size();i++) {
           if(list.get(i)<pivot) {                
               leftarray.add(list.get(i)); //adding elements to the left array less than pivot          
           }
           else if(list.get(i)>pivot){//adding elements to the left array greater than pivot
               rightarray.add(list.get(i));            
               //System.out.print(list.get(i));
           }                
       }       
       if(leftarray.size()>1){  	   
    	  leftarray= quicksort(leftarray);
       }
       if(rightarray.size()>1){    	   
    	   rightarray=quicksort(rightarray);    	   
       }
       for(int i=0;i<leftarray.size();i++){          
           System.out.print(leftarray.get(i)+" ");           
           temp.add(leftarray.get(i)); // creating a new list with the left+pivot+right elements and passing them.          
       }
       System.out.print(pivot+" ");
       temp.add(pivot);
       for(int i=0;i<rightarray.size();i++){          
            System.out.print(rightarray.get(i)+" "); 
            temp.add(rightarray.get(i));
       }
       System.out.println();
      return temp;       
	}

}
