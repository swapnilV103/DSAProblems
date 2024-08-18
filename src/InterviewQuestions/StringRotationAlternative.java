package InterviewQuestions;

import java.util.Arrays;

public class StringRotationAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one ="abcde";
                    	
		String two ="deabc";
		char[] arrOne = one.toCharArray();
		char[] arrTwo = two.toCharArray();
		char temp;
		
		for(int i=0;i<one.length()-1;i++) {
			temp=arrOne[i];
			arrOne[i]=arrOne[one.length()-1];
			arrOne[i+1]=temp;
			
			if(Arrays.equals(arrOne, arrTwo)) {
				System.out.print("hiiiiiiiiii");
				
			}
		}
		
		

		}

	}
