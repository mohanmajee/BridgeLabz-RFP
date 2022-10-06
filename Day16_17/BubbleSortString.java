package Day16_17;

public class BubbleSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();		
		System.out.println("Enter the number of elements you want to insert:");		
		int n = u.inputInteger();
		String arr[] = u.arrayString(n);	
		System.out.println("Words Before sorting:");		
		u.printStringArray(arr);		
        System.out.println();  		
        u.bubbleSortString(arr);              		
        System.out.println();  		
        System.out.println("Array After Bubble Sort");  		
        u.printStringArray(arr);
	}

}
