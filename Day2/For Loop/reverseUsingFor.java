package Day2;

import java.util.Scanner;

public class reverseUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();
        int temp=0;
        int reverse=0;
        for(;num>0;) {
            temp=num%10;
            reverse=reverse*10+temp;
            num/=10;
        }
        System.out.println("Number After Reverse : "+reverse);

	}

}
