package Day3;

import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Element of An Array: ");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("Array Element in Reverse Order are: ");
        for (int i = size-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }

	}

}
