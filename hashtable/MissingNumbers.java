package hashtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        Hashtable<Integer, Integer> A=new Hashtable<Integer, Integer>();
        for(int i=0;i<n;i++)
        { 
        	int num=sc.nextInt();
        	if(A.containsKey(num)){	
        		A.put(num,A.get(num)+1);	
        	}
            else{
            	A.put(num,1);
            }         
        }
        
        int m=sc.nextInt();  
        Hashtable<Integer, Integer> B=new Hashtable<Integer, Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        PriorityQueue<Integer> save=new PriorityQueue<Integer>();
        for(int i=0;i<m;i++)
        { 
        	int num=sc.nextInt();
        	if(B.containsKey(num)){	
        		B.put(num,B.get(num)+1);
        		if(A.get(num)<B.get(num)){
        			if(!list.contains(num)){
        				list.add(num);       					
        			}        				
        		}
        	}
            else{
            	B.put(num,1);
            }         
        }
        
        Collections.sort(list);
        for(int x:list){
        		System.out.print(x+" ");   	
        }
        
     
      
      sc.close();
        
        
     
        
        
        
        
        
        
        
        
	}

}
