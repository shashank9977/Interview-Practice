import java.util.Scanner;

public class convertdate {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] parts=str.split(":");
        
        int hour=Integer.parseInt(parts[0]);
        
        String min=parts[1];       
     //   System.out.println(parts[2].substring(0,3));
        String sec=parts[2].substring(0,2); 
        
       // System.out.println(parts[2]);
        if(parts[2].charAt(2)=='P' && hour!=12){
            
             System.out.print(12+hour+":"+min+":"+sec);
        }
        else if(parts[2].charAt(2)=='P' && hour==12){
        	
        	System.out.print(hour+":"+min+":"+sec);       	
        }        	
        else if(parts[2].charAt(2)=='A' && hour!=12){
        	
           System.out.print("0"+hour+":"+min+":"+sec);
        }
        else
        {
        	System.out.print("00"+":"+min+":"+sec);       	
        }
	}

}
