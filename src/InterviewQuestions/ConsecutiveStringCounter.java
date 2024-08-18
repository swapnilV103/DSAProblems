// aaaaabbbccdaa -> a5b3c2d1a2
package InterviewQuestions;

import java.util.Scanner;

public class ConsecutiveStringCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         
         cons(name);         
	}
	public static void cons(String name) {
		for(int i=0; i<name.length();i++) {
       	 int count =1;
       	 //System.out.println(name.charAt(i));
       	 while(i<name.length()-1 && name.charAt(i)==name.charAt(i+1)) {
       		 count++;
   			 i++; 
       		 }
       	 System.out.print(name.charAt(i)+""+count);
       	 
        }
		
	}
}
	

