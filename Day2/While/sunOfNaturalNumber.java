package Day2;

import java.util.Scanner;

public class sunOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n) {
            sum+=i;
            i++;
        }
        System.out.println("Sum of Natural number = "+sum);

	}

}
