package InterviewQuestions;

public class stringRotaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one = "abc";
		String two = "cab";
		
		if(one.length()==two.length()) {
			System.out.println("equal strings");
			int counter =0;
			int j=0;
			for(int i=0;i<one.length();i++) {
				//j++;
				counter++;
				if(one.charAt(j)==two.charAt(i)) {
					System.out.println(j+" "+i+" "+one.charAt(j)+" "+two.charAt(i));
					j++;
					
					//counter++;
				}
				
			}
			System.out.println(counter);
			System.out.println(one.substring(j-1));
			System.out.println(two.substring(0,j-1));
		
			
			
		}
		else {
			System.out.println("Un equal strings");
		}

	}

}
