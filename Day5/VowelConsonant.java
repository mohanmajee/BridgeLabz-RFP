package Day5;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
        System.out.println("Enter a character:");
        Scanner sc=new Scanner(System.in);
        ch = sc.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("the given char is vowel");
        } else
        System.out.println("The given char is consonant");

	}

}
