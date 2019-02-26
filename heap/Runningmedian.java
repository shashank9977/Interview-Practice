package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Runningmedian {

	static PriorityQueue<Integer> max_heap=new PriorityQueue<Integer>(Collections.reverseOrder());
	static PriorityQueue<Integer> min_heap=new PriorityQueue<Integer>();
	//https://www.hackerrank.com/challenges/find-the-running-median
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//double median;
		
		
		int mx_max_heap=0;
		int mn_min_heap=0;
		for(int i=0;i<n;i++){
			
			if(i==0){				
				min_heap.add(sc.nextInt());		
				System.out.println(Double.valueOf(min_heap.peek()));			
			}
			else if(i==1){							
				max_heap.add(sc.nextInt());
				if(max_heap.peek()>min_heap.peek())
				{					
					mx_max_heap=max_heap.poll();
					mn_min_heap=min_heap.poll();					
					min_heap.add(mx_max_heap);
					max_heap.add(mn_min_heap);
					
					
					//System.out.println("areyy"+min_heap.peek()+"  "+max_heap.peek());
				}	
				System.out.println(Double.valueOf(max_heap.peek()+min_heap.peek())/2);
			}
			else{			
				int add_val=sc.nextInt();				
				if(add_val<max_heap.peek()) {					
					max_heap.add(add_val);
					mx_max_heap=max_heap.peek();								
				}
				else if(add_val>max_heap.peek()){					
					min_heap.add(add_val);
					//mn_min_heap=min_heap.peek();		
				}
						
				balance(min_heap,max_heap);	
				result(min_heap,max_heap);				
			}		
		}
	}

	private static void result(PriorityQueue<Integer> min_heap, PriorityQueue<Integer> max_heap) {
		// TODO Auto-generated method stub		
		if(min_heap.size()>max_heap.size()){
			
			//System.out.println(min_heap.peek());
			
			System.out.println(Double.valueOf(min_heap.peek()));		
		}
		else if(max_heap.size()>min_heap.size()){
			
			//System.out.println(min_heap.peek());
			System.out.println(Double.valueOf(max_heap.peek()));			
		}
		else{					
			System.out.println(Double.valueOf(max_heap.peek()+min_heap.peek())/2);					
		}
	}

	private static void balance(PriorityQueue<Integer> min_heap,PriorityQueue<Integer> max_heap){
	
		if(max_heap.size()-min_heap.size()>=2){		
				
			min_heap.add(max_heap.poll());				
		}
		else if(min_heap.size()-max_heap.size()>=2){
			
			max_heap.add(min_heap.poll());
			
		}
	}

}
