package hashtable;

public class islandpermiter 
{
	public static void main(String[] args) 
	{
		int[][] island=new int[][]{{0,1,0,0},
									{1,1,1,0},
									{0,1,0,0},
									{1,1,0,0}};
		int result=0;
		for(int i=0;i<island.length;i++)
		{
			for(int j=0;j<island[0].length;j++)
			{
				if(island[i][j]==1)
				{
					result+=4;	
					if(i>0 && island[i-1][j]==1)
						{
						result-=2;
						}
					if(j>0 && island[i][j-1]==1)
					{
					result-=2;
					}					
				}				
			}			
		}
		
		System.out.println(result);
									
									
	}
}
