package InterviewQuestions;

import java.util.Arrays;

public class LogicalStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one ="abcde";
		String three = "abfgh";
    	
		
		String two ="eabcd";
		char[] arrOne = one.toCharArray();
		char[] arrTwo = two.toCharArray();
		
		while(one.length()==two.length()) {
			
			int shift =1;
			char [] rotate = new char[one.length()];
			int j=one.length(); 
			while(j>0) {
				for(int i=0;i<one.length();i++) {
					int newIndex = (i+shift)%one.length();
					rotate[newIndex]= arrOne[i];
				}
				
				if(Arrays.equals(rotate, arrTwo)) {
					System.out.println("Yes the array is rotated");
					break;
				}
				j--;
			}
			
		}
		

	}

}
