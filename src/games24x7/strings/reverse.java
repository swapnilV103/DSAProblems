package games24x7.strings;

import java.util.Scanner;

public class reverse {
	
	
	public static String rev(String rev1) {
		int len = rev1.length();
		char rev;
		String reverse = "";
		
		for(int i=0;i<len;i++) {
			rev = rev1.charAt(i);
			reverse = rev+reverse;
		}
		
		return reverse;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] a=input.toCharArray();
		
		rev(input);
		System.out.println(rev(input));
		
		oneof var = new oneof();
		System.out.println(var.rev1("swapy"));

	}
	
	
	
	

}

class oneof{
	public static int one1=9;
	
	public String rev1(String rev2) {
		int len = rev2.length();
		char rev;
		
		int left=0,right=len-1;
		char[] newrev = rev2.toCharArray();
		
		while(left<right) {
			char temp = newrev[left];
			newrev[left]=newrev[right];
			newrev[right]=temp;
			left++;
			right--;
		}
		String reverse = new String(newrev);
		return reverse;
	
}
}
