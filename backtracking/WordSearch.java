package backtracking;

public class WordSearch {

	public static void main(String[] args) 
	{

	
		int[][] matrix=new int[][]{{'A','B','C','E'},
									{'S','F','C','S'},
									{'A','D','E','E'}};
		String str="AAFCED";
		boolean result=false;
	boolean[][] visited=new boolean[matrix.length][matrix[0].length];								
									for(int i=0;i<matrix.length;i++)
									{
										for(int j=0;j<matrix[0].length;j++)
										{											
											if(wordsearch(matrix, i,j,visited,str,0))
												{
												result=true;
													
												}
										}
									}
					System.out.println(result);
									
		

	}

	private static boolean wordsearch(int[][] matrix, int i, int j,boolean[][] visited,String str, int index) 
	{
		if(index==str.length())
		{
			return true;
			
		}
		
		
		if(i<0 || i>=matrix.length||j>=matrix[0].length||j<0|| visited[i][j]|| matrix[i][j]!=str.charAt(index))
		{
			return false;			
		}	
		else
		{	
			visited[i][j]=true;
		return wordsearch(matrix,i+1,j,visited,str, index+1)
				||wordsearch(matrix,i-1,j,visited, str,index+1)
				||wordsearch(matrix,i,j+1,visited, str,index+1)
				||wordsearch(matrix,i,j-1,visited, str,index+1);				
		}
		
		
	}

}
