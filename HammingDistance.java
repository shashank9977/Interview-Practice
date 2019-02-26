
public class HammingDistance {

	public static void main(String[] args)
	{
		HammingDistance hdistance=new HammingDistance();
		hdistance.findhammingdistance(3,4);	
	}
	private void findhammingdistance(int x, int y) 
	{
			System.out.println(Integer.bitCount(x^y));		
	}

}
