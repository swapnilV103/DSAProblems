package InfosysInterviewQuestions;

import java.util.Scanner;

public class totalDigitsinNumber {
	
	
	public static int result(int number) {
		
		int a = number;
		int count = 0;
		
		while(a>0) {
			a = a/10;
			count++;
			
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String len = number+"";
		
		int digits = result(number);
		System.out.print(digits);
		System.out.println(len.length());
		

	}

	
}
