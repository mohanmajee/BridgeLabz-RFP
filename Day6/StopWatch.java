package Day6;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		int start= sc.nextInt();
		int stop= sc.nextInt();
		if (start == 0)
		{
			long a = System.currentTimeMillis();
		}
		else if (stop == 0)
		{
			long b = System.currentTimeMillis();
		}
		else
		{
			System.out.println("enter 0 to start");
		}
		long diff = stop - start;
		System.out.println("The difference between start and stop is " + diff);

	}

}
