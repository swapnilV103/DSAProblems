package games24x7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDupliacteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,3,2));
		System.out.println(arr);
		
		HashSet s = new HashSet(arr);
		Set<Integer> hash1 = new HashSet<>(arr);
		
		Set<Integer> hash = new HashSet<>();
		
		for(Integer a : arr) {
			hash.add(a);
		}
		System.out.println(hash);
		System.out.println(s);
		System.out.println(hash1);
		
		

	}

}
