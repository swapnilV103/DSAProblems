package InfosysInterviewQuestions;

import java.util.Scanner;

public class reverseANumber {
	
	
	public static int result(int number) {
		
		int num = number,r;
		
		int rev=0;
		
		while(num!=0) {
			r = num%10;
			rev = rev*10 +r;
			num = num/10;
			
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int result = result(number);
		
		System.out.println(result);
		

	}

}
