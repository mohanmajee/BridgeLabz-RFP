package Day5;

import java.util.Scanner;

public class HarmonicNumber {
	public double Nth_Harmonic_Number(double n) {
        double i, sum = 0;
        for (i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        double num=sc.nextDouble();
        HarmonicNumber obj=new HarmonicNumber();
        System.out.println(obj.Nth_Harmonic_Number(num));

	}

}
