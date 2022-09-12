package Day3;

import java.util.Scanner;

public class duplicateElement {

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
        System.out.println("Duplicate Elements are: ");
        for(int i = 0; i < size; i++) {  
            for(int j = i + 1; j < size; j++) {  
                if(array[i] == array[j])  
                    System.out.println(array[j]);  
            }  
        }  

	}

}
