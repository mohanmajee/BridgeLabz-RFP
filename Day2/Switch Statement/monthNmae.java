package Day2;

import java.util.Scanner;

public class monthNmae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number between 1 to 12:- ");
        int ch= sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("You chosen JANUARY");
                break;
            case 2:
                System.out.println("You chosen FEBRUARY");
                break;
            case 3:
                System.out.println("You chosen MARCH");
                break;
            case 4:
                System.out.println("You chosen APRIL");
                break;
            case 5:
                System.out.println("You chosen MAY");
                break;
            case 6:
                System.out.println("You chosen JUNE");
                break;
            case 7:
                System.out.println("You chosen JULY");
                break;
            case 8:
                System.out.println("You chosen AUGUST");
                break;
            case 9:
                System.out.println("You chosen SEPTEMBER");
                break;
            case 10:
                System.out.println("You chosen OCTOBER");
                break;
            case 11:
                System.out.println("You chosen NOVEMBER");
                break;
            case 12:
                System.out.println("You chosen DECEMBER");
                break;
            default:
                System.out.println("Invalid Selection");
        }

	}

}
