package Day2;

import java.util.Scanner;

public class singleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter a Single Digit Number:- ");
	        int num= sc.nextInt();
	        if(num==0) {
	            System.out.println("You Enter ZERO");
	        } else if (num==1) {
	            System.out.println("You Enter ONE");
	        } else if (num==2) {
	            System.out.println("You Enter TWO");
	        } else if (num==3) {
	            System.out.println("You Enter THREE");
	        } else if (num==4) {
	            System.out.println("You Enter FOUR");
	        } else if (num==5) {
	            System.out.println("You Enter FIVE");
	        } else if (num==6) {
	            System.out.println("You Enter SIX");
	        } else if (num==7) {
	            System.out.println("You Enter SEVEN");
	        } else if (num==8) {
	            System.out.println("You Enter EIGHT");
	        } else if (num==9) {
	            System.out.println("You Enter NINE");
	        }
	     else {
	            System.out.println("Enter a valid single Digit Input .");
	        }

	}

}
