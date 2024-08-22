package InfosysInterviewQuestions.StringQuestions;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println(reverse(name));
		

	}
	
	public static String reverse(String name) {
		
		String reverse = "";
		char ch;
				
		for(int i=0;i<name.length();i++) {
			ch = name.charAt(i);
			
			reverse = ch + reverse;
			
		}	
		return reverse;
		
	}

}
