
import java.util.ArrayList;
import java.util.List;

public class pascalstraingle {

	public static void main(String[] args) 
	{
		int numRows=4;
		ArrayList<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows <=0){
            
        	return;        	
        }
        for (int i=0; i<numRows; i++)
        {
            List<Integer> row =  new ArrayList<Integer>();
            for (int j=0; j<=i; j++)
            {
                if (j==0 || j==i)
                {
                    row.add(1);
                } 
                else 
                {
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        
        for(List<Integer> x:triangle)
        {
        	for(Integer a:x)
        	{
        		System.out.print(a);        		
        	}
        	System.out.println();     	
        }
        
		

	}

}
