package Day16_17;

public class BubbleSortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();		
		System.out.println("Enter the number of elements you want to insert:");	
		int n = u.inputInteger();		
		int arr[] = u.arrayInt(n);		
		System.out.println("Before Insertion Sort");  	
		u.printArray(arr);	
        System.out.println();    		
        u.bubbleSortInteger(arr);//sorting array elements using bubble sort 		
        System.out.println("Array After Bubble Sort");  		
        u.printArray(arr);

	}

}
