package Day2;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();
        int num2=num;
        int temp=0;
        int reverse=0;
        for(;num>0;) {
            temp=num%10;
            reverse=reverse*10+temp;
            num/=10;
        }
        if(num2==reverse) {
            System.out.println(num2+" is a Palindrome");
        } else {
            System.out.println(num2+" is NOT a Palindrome");
        }

	}

}
