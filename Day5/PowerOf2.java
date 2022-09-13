package Day5;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num>31){
            System.out.println("overflow");
        }
        else
        for (int i = 1; i <= num; i++) {
            System.out.println("Power of 2^" + i + " is :" + (Math.pow(2, i)));
        }

	}

}
