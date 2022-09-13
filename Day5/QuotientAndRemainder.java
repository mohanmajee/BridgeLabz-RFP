package Day5;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,quotient,remainder;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num1 and num2");
        num1=sc.nextInt();
        num2= sc.nextInt();
        remainder=num1%num2;
        quotient=num1/num2;
        
        System.out.println("The quotient are:"+ quotient);
        System.out.println("The remainder are:"+ remainder);

	}

}
