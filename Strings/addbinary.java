package Strings;

public class addbinary {

	public static void main(String[] args) 
	{
	String  a="100";
	String  b= "111";
	int i=a.length()-1;
	int j=b.length()-1;
	int carry=0;
	int sum=0;
	StringBuilder sb=new StringBuilder();
	while((i>=0) || (j>=0))
	{
					sum=carry;
				if(i>=0)
				{				
				sum+=(a.charAt(i)-'0');
				i--;
				}			
				if(j>=0)
				{
					sum+=(b.charAt(j)-'0');
					j--;
				}
				sb.append(sum%2);			
				carry=sum/2;
			
	}
	
		if(carry!=0)
		{
			sb.append(carry);
		}
	
	System.out.println(sb.reverse().toString());
		
		
		

	}

}
