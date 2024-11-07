package SaishQuestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		ArrayList<Integer> arr2 = new ArrayList<>(10);
		
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(1,2,3));
		
		
		List<String> list1 = new ArrayList<>();
		
		
		String name = "madam";
		String name2 = "madam";
		String rev = "";
		
		for(int i =0; i<=name.length()-1;i++) {
			
			rev = name.charAt(i)+rev;  
			                         
			
		}
		
		
		
		
		if(name.equals(rev)) {
			System.out.println("it's a palindrome");
		}else {
			System.out.print("It's not");
		}
		
		
		System.out.println(rev);
		
		
		

	}

}
