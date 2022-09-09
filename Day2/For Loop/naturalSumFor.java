package Day2;

import java.util.Scanner;

public class naturalSumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The value of n : ");
        int sum=0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            sum+=i;
        }
        System.out.println("Sum of "+n+" natural number =  "+sum);

	}

}
