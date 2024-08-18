package InterviewQuestions;

public class SimpleStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one = "abcdefgh";
		String two = "defghabc";
		int j=0;
		int temp = 0;
		
		if(one.length()==two.length()) {
			for(int i=0;i<one.length();i++) {
				if(two.charAt(i)==one.charAt(j)) {
					temp =i;
				}
			}
			
			if(one.substring(temp+1).equals(two.substring(0, temp))) {
				System.out.println("Yes! it's a rotating string with rotation value:"+" "+temp);
			}
		}
		else {
			System.out.println("Strings cannot be rotating");
		}
		
		
	  

	}

}
