package heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseCookies {

	
	//https://www.hackerrank.com/challenges/jesse-and-cookies
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		int[] A=new int[n];
		for(int i=0;i<n;i++){
						
			A[i]=sc.nextInt(); //cookies
			queue.add(A[i]);
		}
		
		while(queue.peek()<k){
			
			int cookie_1=queue.poll();
			int cookie_2=queue.poll();
			
			int temp_cookie=1*cookie_1 +2*cookie_2;
			queue.add(temp_cookie);	
			count++;
			
			 if(queue.size()<2){ // checking if there are enough cookies to be added in the next move.
				 
				 count=-1;
				 break;
				 
			 }
		}
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
