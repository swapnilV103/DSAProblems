package Mastercard;

public class mySolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String base = "swapnL";
		
		String counter="";
		
		char[] basic = base.toCharArray();
		
		for(char c: basic) {
			String a = ""+c;
			
			if(Character.isDigit(c)) {
				while(Integer.parseInt(a)>0) {
					counter = counter+"1";
				}
				
			}
			else {
				counter = ""+a;
			}
			
		}
		
		System.out.println(counter);
	}

}
