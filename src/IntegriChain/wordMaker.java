package IntegriChain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class wordMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("hi");
		ArrayList<Character> arr = new ArrayList<>(Arrays.asList('a', 'f', 'r', 'r', 'e', 'i', 'o', 'h', 'c', 's', 'u', 'w', 'a', 'n', 'd'));
		
		
		HashMap <Character,Integer> map1 = new HashMap<>();
		ArrayList<String> name = new ArrayList<>(Arrays.asList("arura","ford","ferrari","honda","nissan","datsun"));

		for(char a: arr) {
			if(map1.containsKey(a)) {
				map1.put(a, map1.get(a)+1);
			}
			else {
				map1.put(a, 1);
			}	
		}
		
		
		for(String word:name) {
			
			char[] wordChar = word.toCharArray();
			
			for(char a:wordChar) {
				if(map1.containsKey(a)) {
					map1.put(a,map1.get(a)-1);
				}
				else {
					System.out.println("The Word "+word+" cannot be printed");
				}
				
				
			}
			
		}
		
		
		
		
		
		
		
		//System.out.println(map1);


	}

}
