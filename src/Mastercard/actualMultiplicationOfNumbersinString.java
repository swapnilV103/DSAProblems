package Mastercard;

public class actualMultiplicationOfNumbersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Try programiz.pro");
        
        String name = "abc3d2";
        
        
        char[] newname = name.toCharArray();
        
        
        StringBuilder result = new StringBuilder();
        StringBuffer res = new StringBuffer();
        String result1;
        for(char ch: newname){
            if(Character.isDigit(ch)){
                int count = Character.getNumericValue(ch);
                result.append("1".repeat(count));
                
            }
            else{
                result.append(ch);
              
                
            }
        }
        System.out.println(result);
        

	}

}
