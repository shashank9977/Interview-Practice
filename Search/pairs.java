package Search;

import java.util.Arrays;
import java.util.Scanner;

public class pairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	        int k=sc.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }        
	        Arrays.sort(arr);
	        int start=0;
	        int end=arr.length-1;
	        int count=0;
//	        while(start<=end){           
//	            int diff=arr[end]-arr[start];
//	            if(diff!=k){
//	                end--;
//	            }
//	            else if(diff==k){
//	                count++;
//	                end--;
//	            }	            
//	            if(start==end){                
//	                start++;
//	                end=arr.length-1;
//	            }
//	        }	        	        
	        start=0;
	        end=1;
	        while(end<n){           
	            int diff=arr[end]-arr[start];
	            if(diff<k){
	                end++;
	            }
	            else if(diff>k){
	            	
	            	start++;
	            }
	            else if(diff==k){
	                count++;
	                end++;
	            }	            
	        }
	        System.out.print(count);
	    }

	}

