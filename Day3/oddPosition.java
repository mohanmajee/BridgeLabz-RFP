package Day3;

import java.util.Scanner;

public class oddPosition {

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
        System.out.println("Element of Odd Position Array are: ");
        for (int i = 0; i < size; i+=2) {
            System.out.print(array[i]+" ");
        }

	}

}
