package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class arthematicslices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arthematicslices slices=new arthematicslices();
		slices.findarthematicslices();
		
		
	}

	private void findarthematicslices() {
		int[] A=new int[]{2,4,6,8,10};
		int res = 0;
	    Map<Integer, Integer>[] map = new Map[A.length];
			
	    for (int i = 0; i < A.length; i++) {
	        map[i] = new HashMap<>(i);
	        	
	        for (int j = 0; j < i; j++) {
	            long diff = (long)A[i] - A[j];
	            if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) continue;	        		
	            int d = (int)diff;
	            int c1 = map[i].getOrDefault(d, 0);
	            int c2 = map[j].getOrDefault(d, 0);
	            res += c2;
	            map[i].put(d, c1 + c2 + 1);
	        }
	    }
	    System.out.println(res);
		
	}
	
	

}
