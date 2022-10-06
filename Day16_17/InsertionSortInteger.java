package Day16_17;

public class InsertionSortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();		
		System.out.println("Enter the number of elements you want to insert:");		
		int n = u.inputInteger();		
		int myarray[] = u.arrayInt(n);		
		System.out.println("Before Insertion Sort");  		
		u.printArray(myarray);    		
		u.insertionSortInteger(myarray);  
		System.out.println("After Insertion Sort");  		
		u.printArray(myarray);

	}

}
