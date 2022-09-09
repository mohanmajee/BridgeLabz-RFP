package Day2;

import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double delta=0.0;
        double root1=0.0;
        double root2=0.0;
        System.out.println("Enter the value of a ");
        double a = sc.nextDouble();
        if(a==0.0) {
            System.out.println("For Quaderatic Equation value of  a Cannot be Zero..");
            return ;
        } 
        else {
            System.out.println("Enter the value of b");
            double b = sc.nextDouble();
            System.out.println("Enter the value of c");
            double c = sc.nextDouble();
            System.out.println("Entered Quaderatic Equation are" + a + "x^2+" + b + "x+" + c);
            delta = ((Math.pow(b, 2)) - (4 * a * c));
            if (delta < 0) {
                System.out.println("Root Will Be imaginary ...");
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-delta) / (2 * a);
                System.out.printf("root1= %.2f+%.2fi", real, imaginary);
                System.out.format("\nroot1= %.2f-%.2fi", real, imaginary);
            } 
            else if (delta == 0) {
                System.out.println(" Roots Will real and equal.");
                root1 = (((-(b)) + Math.sqrt(delta)) / (2 * a));
                root2 = (((-(b)) - Math.sqrt(delta)) / (2 * a));
                System.out.println(root1 + "   " + root2);
            } 
            else if (delta > 0) {
                System.out.println(" Roots Will real and distinct..");
                root1 = (((-b) + Math.sqrt(delta)) / (2 * a));
                root2 = (((-b) - Math.sqrt(delta)) / (2 * a));
                System.out.println(root1 + "   " + root2);
            }
        }

	}

}
