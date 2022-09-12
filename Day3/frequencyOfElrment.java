package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class frequencyOfElrment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        System.out.println("Enter the Element in Array:");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array Are:");
        System.out.println(Arrays.toString(arr));
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            System.out.println(arr[i]+" comes "+ count+ " times");
        }

	}

}
