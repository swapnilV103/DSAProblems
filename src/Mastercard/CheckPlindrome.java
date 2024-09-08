package Mastercard;

public class CheckPlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "asa";
		
		int left = 0;
		int right = name.length()-1;
		boolean status =false;
		while(left<right) {
			if(name.charAt(left)!=name.charAt(right)) {
				status =false;
				break;
			}
			left++;
			right--;
			status=true;
			
			
		}
		
		System.out.print("The string is : "+status);
		
		

	}

}
