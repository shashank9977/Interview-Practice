package Strings;

public class multiplystrings {
	//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.
	public static void main(String[] args) 
	{
		String num1="123";
		String num2="35";
		 int n1 = num1.length(), n2 = num2.length();
	        int[] products = new int[n1 + n2];
	        for (int i = n1 - 1; i >= 0; i--) {
	            for (int j = n2 - 1; j >= 0; j--) {
	                int d1 = num1.charAt(i) - '0';
	                int d2 = num2.charAt(j) - '0';
	                products[i + j + 1] += d1 * d2;
	            }
	        }
	        int carry = 0;
	        for (int i = products.length - 1; i >= 0; i--) {
	            int tmp = (products[i] + carry) % 10;
	            carry = (products[i] + carry) / 10;
	            products[i] = tmp;
	        }
	        StringBuilder sb = new StringBuilder();
	        for (int num : products) sb.append(num);
	        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
	         String str="";
			if (sb.length() == 0)
				str = "0";
			else
				str = sb.toString();
						
			System.out.println(str);

	}

}
