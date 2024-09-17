package InfosysInterviewQuestions;

import java.util.Scanner;

public class SumofDigits {

	
	
public static int result(int number) {
		
		int num = number,r;
		int sum=0;	
		
		while(num!=0) {
			r = num%10;
			sum = sum+r;
			num = num/10;
			
		}	
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a ='1';
		Integer.parseInt(String.valueOf(a));
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int result = result(number);
		System.out.println(result);
		

	}

}
