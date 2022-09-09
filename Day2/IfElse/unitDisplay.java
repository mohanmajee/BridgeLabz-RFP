package Day2;

import java.util.Scanner;

public class unitDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Numbers List .. 1, 10, 100, 1000");
        System.out.println("Enter Number From above Lists ");
        int num= sc.nextInt();
        if(num==1) {
            System.out.println("You Enter UNIT");
        } else if (num==10) {
            System.out.println("You Enter TEN");
        } else if (num==100) {
            System.out.println("You Enter HUNDRED");
        }
        else if (num==1000) {
            System.out.println("You Enter THOUSAND");
        }
        else {
            System.out.println("Invalid Input.");
        }

	}

}
