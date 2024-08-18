package JatinClassLecture;

import java.util.Scanner;

public class reverseStringloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String rev = sc.nextLine();
		
		System.out.print(reverseString(rev));  
		

	}
	
	public static String reverseString(String rev) {
		String reversed = "";
		
		for(int i = rev.length()-1; i>=0; i--) {
			reversed = reversed+rev.charAt(i);
		}
		
		
		return reversed;
		
	}

}
