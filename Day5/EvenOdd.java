package Day5;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        System.out.println("Enter an integer number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num % 2==0)
            System.out.println("No is even");
        else
            System.out.println("No is odd");

	}

}
