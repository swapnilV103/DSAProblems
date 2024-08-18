package games24x7.strings;

public class rotationCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "abcdefgh";
        String two = "defghabc";
        
        String concat = one+one;
        
        
        if(one.length()==two.length()) {
        	int index = concat.indexOf(two);
        	
        	if(index!=-1) {
        		System.out.print("Yes it's rotated and valuw is : "+index);
        	}
        	
        }
       

	}

}
