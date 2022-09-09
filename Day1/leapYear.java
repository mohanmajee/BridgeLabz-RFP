package Day1;

import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year ");
        Scanner sc =new Scanner(System.in);
        int year= sc.nextInt();
        if(year%100==0) {
            if(year % 400 == 0) {
                    System.out.println(year + " is Leap year");
                } 
            else {
                    System.out.println(year + " is Not Leap year");
                }
        	} 
        	else if(year%4==0) {
                System.out.println(year + " is Leap year");
            } 
        	else {
                System.out.println(year + " is Not Leap year");
            }

	}

}
