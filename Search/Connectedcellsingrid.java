package Search;

import java.util.Scanner;

public class Connectedcellsingrid {
	
	static Scanner sc=new Scanner(System.in);
	static int rows=sc.nextInt();
	static int cols=sc.nextInt();
	static int[][] mat=new int[rows][cols];
	static boolean[][] visited=new boolean[rows][cols];
	public static void main(String[] args) 
	{		
		int max=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<rows;i++){			
			for(int j=0;j<cols;j++){
				  mat[i][j]=sc.nextInt();								 
			}			
		}			
		for(int i=0;i<rows;i++){			
			for(int j=0;j<cols;j++){
				if(mat[i][j]==1){					
					count=connect(i,j,count,visited);
					max=Math.max(max,count);
				}				 				 				
			}			
		}
		 System.out.println(max);
	}

	private static int connect( int i , int j, int count, boolean[][] visited) {			
		if(i<0 || j<0 ||i>=mat.length|| j>=mat.length || visited[i][j] || mat[i][j]==0) return 0 ;
		
		else{
		visited[i][j]=true;
		return 1+connect(i+1,j,count, visited)+connect(i-1,j,count, visited)+connect(i,j-1, count, visited)+connect(i,j+1,count,visited);			 
		}	
		}			
	}

