import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class Example1 {

	public static void main(String[] args) throws ParseException 
		{
			
		int[] A=new int[]{40,40,100,80,20};
		int[] B=new int[]{3,3,2,2,3};
		
		int x_start=0;
		int y_start=0;
		int M=3;
		int X=5;
		int Y=200;
        int	init=0;
		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
		int stops=0;
		int stops2= calculatestops(stops,A,B,init,x_start,y_start,mp,M,X,Y);
            
		System.out.println(stops2);
    	}

	private static int calculatestops(int stops,int[] a, int[] b, int init, int x_start, int y_start, HashMap<Integer,Integer> st, int m,
			int x, int y) 
	{
		
		while(init<a.length && x_start<x && y_start+a[init]<=y)
		{
			st.put(init, b[init]);
			x_start++;
			y_start=y_start+a[init];			
			init++;			
		}
		y_start=0;
		x_start=0;
		
		for(int i=0;i<=m;i++)
		{
			if(st.containsValue(i))
			{	
				st.values().removeAll(Collections.singleton(i));			
				stops++;		
			}				
		}
		stops++;
		
		if(init<a.length)
		{
			stops=calculatestops(stops,a,b,init,x_start,y_start,st,m,x,y);
		}
	
		return stops;
		
	}
	}


