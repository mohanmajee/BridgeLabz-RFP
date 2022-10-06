package Day16_17;

public class PalindronePrimeNumber {
	static int[] arr;	
	static String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();		
	    System.out.println("Enter the number:");		
	    int x = u.inputInteger();		
	    System.out.println(u.primeNumber(x));		
	    arr = new int[(u.primeNumber(x)).size()]; 		
	    for (int i =0; i < (u.primeNumber(x)).size(); i++) 		    
    	        arr[i] = (u.primeNumber(x)).get(i); 		
	    int n = arr.length;		
	    u.primePalindrome(arr,n);

	}

}
