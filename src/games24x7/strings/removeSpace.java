package games24x7.strings;

import java.util.Scanner;

public class removeSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String spaced = sc.nextLine();
		withoutSpace(spaced);

	}

	public static void withoutSpace(String spaced) {
		// TODO Auto-generated method stub
		String Unspaced = "";
		
		for(int i=0;i<=spaced.length()-1;i++){
			if(spaced.charAt(i)!=' ') {
				Unspaced= Unspaced+spaced.charAt(i);
			}
		}
		
		System.out.print(Unspaced);
		
	}

}
