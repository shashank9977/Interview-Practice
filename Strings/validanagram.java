package Strings;

public class validanagram {

	public static void main(String[] args)
	{
		String a="tiger";
		String b="rtgir";
		int chars=0;
		for(int i=0;i<a.length();i++)
		{
			chars+=Character.getNumericValue(a.charAt(i));
			chars-=Character.getNumericValue(b.charAt(i));
		}
		
		if(chars!=0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
		// TODO Auto-generated method stub

	}

}
