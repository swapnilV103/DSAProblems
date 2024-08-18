package InfosysInterviewQuestions;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		if(isPalindrome(number)) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		System.out.println(isPalindrome(number));


	}

	public static boolean isPalindrome(int Number) {

		int a =Number;
		int rev=0;

		while(a!=0) {
			int r = a%10;
			rev = rev*10+r;
			a=a/10;
		}

		return Number==rev;

	}

}
