package Day2;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num=sc.nextInt();
        int temp=0;
        int reverse=0;
        System.out.println("Number before Reverse : "+num);
        while(num>0) {
            temp=num%10;
            reverse=reverse*10+temp;
            num/=10;
        }
        System.out.println("Number After Reverse : "+reverse);

	}

}
