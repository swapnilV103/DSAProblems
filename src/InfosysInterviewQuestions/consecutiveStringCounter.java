package InfosysInterviewQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class consecutiveStringCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		consecutive(name);
		

	}
	
	public static void consecutive(String name) {
		
		int stringLength = name.length();
	
		
		for(int i=0; i<stringLength;i++) {
			int counter =1;
			
			while(i<stringLength-1 && name.charAt(i)==name.charAt(i+1)) {
				counter++;
				i++;
				
			}
			
			System.out.println(name.charAt(i)+":"+counter+" ");	
			
		}
		

		HashMap<Character,Integer> map = new HashMap();
		
		char[] namechar = name.toCharArray();
		
		for(char a : namechar) {
			if(map.containsKey(a) && a!=' ') {
				
				map.put(a, map.get(a)+1);
				
			}else if(a!=' ') {
				map.put(a, 1);
			}
			
		}
		
		System.out.println(map);
		
	}
	
	

}
