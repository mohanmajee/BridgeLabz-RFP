package Day16_17;

public class AnagramPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();		
		System.out.println("Enter the String 1:");	
		String str1 = u.inputString();	
		System.out.println("Enter the String 2:");	
		String str2 = u.inputString();	
		u.anagram(str1, str2);	
		u.anagramPalindrome(str1, str2);

	}

}
