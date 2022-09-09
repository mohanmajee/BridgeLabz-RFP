package Day2;

import java.util.Scanner;

public class Distance {
	public static void main( String[] args )
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Value of x ");
        double x = sc.nextDouble();
        System.out.println("Enter the Value of y ");
        double y = sc.nextDouble();
        double distance=0;
        x = x * x;
        y = y * y;
        double sum = x + y;
        distance =Math.sqrt(sum);
        System.out.println("The Euclidean distance from the point (x, y) to the origin (0, 0) are "+distance);
    }

}
