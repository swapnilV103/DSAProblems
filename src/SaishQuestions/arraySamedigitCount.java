package SaishQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class arraySamedigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Integer[] array1 = {4,4,5,5,6,6,7,2,4,7,6,4};
		String name = "swaaapniiia  sll";
		char[] a = name.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char p: a) {
			if(map.containsKey(p)) {
				
				map.put(p, map.get(p)+1);
			} 
			else {
				map.put(p, 1);
			}
			
		}
		
				
		//System.out.print(hash);
		//System.out.print(hash1);
		System.out.println(map);
		
		
		String one = Arrays.toString(array1);
		//System.out.println(one);
		
		HashSet<Integer> hash = new HashSet<Integer>(Arrays.asList(array1));
		HashSet<Integer> hash1 = new HashSet<Integer>(Arrays.asList(array1));
		for(int s:array1) {
			hash1.add(s);
		}
		

	}

}
