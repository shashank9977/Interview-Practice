package hashtable;

import java.lang.reflect.Array;

public class Sherlockandarray {
	//https://www.hackerrank.com/challenges/sherlock-and-array/problem
	 static String solve(int[] a, int rightsum){
         int total=rightsum;
         int leftsum=0;
         int k=0;
         int l=0;
         boolean found=false;
         int n=a.length;
         
         if(a.length==1){                
             found=true;
         }        
 else{          
    for(int i=1;i<a.length-1;i++){                    
          leftsum+=a[i-1];
          rightsum=rightsum-(a[i]);
          rightsum=rightsum-leftsum;
        //System.out.println(leftsum+" "+rightsum);
        
        if(leftsum==rightsum){                    
             found=true;   
         }
        rightsum=total;
         }             
     }           
      if(found){
            return "YES";                
       }
     else{
              return "NO";                 
        } 
 }

 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int T = in.nextInt();
     for(int a0 = 0; a0 < T; a0++){
         int n = in.nextInt();
         int[] a = new int[n];
         int rightsum=0;
         for(int a_i=0; a_i < n; a_i++){
             a[a_i] = in.nextInt();
             rightsum+=a[a_i];
         }
         String result = solve(a, rightsum);
         System.out.println(result);
     }
 }

}
