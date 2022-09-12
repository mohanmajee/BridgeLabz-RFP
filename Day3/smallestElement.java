package Day3;

import java.util.Scanner;

public class smallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        min = a[0];
        for(int i = 0; i < n; i++)
        {
            if(min > a[i])
            {
                min = a[i];
            }
        }
        System.out.println("Maximum value:"+min);

	}

}
