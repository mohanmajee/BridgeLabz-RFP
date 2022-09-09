package Day1;

import java.util.Scanner;

public class SwC {
	 public static void main(String s[])
	    {
		 Scanner sc= new Scanner(System.in)
				 ;
	        int day = sc.nextInt();
	        
	        switch(day)
	        {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Satuday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Weekend");
	                
	        }
	    }

}
