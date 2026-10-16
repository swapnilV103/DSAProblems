package games24x7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDupliacteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = new Integer[]{1,4,3,5};
		int [] ar = {1,2,5,3};
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(array));
		System.out.println(arr2);

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,7,3,4,5,3,2));
		ArrayList<Integer> newarr = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,5,5,4,411));
		System.out.println(arr);
		
		
		HashSet<Integer> s = new HashSet<Integer>(arr);
		
		Set<Integer> hash1 = new HashSet<>(arr);
		
		Set<Integer> hash = new HashSet<>();

		HashSet<Integer> myHash= new HashSet<>(newarr);
		
		
		
		for(Integer a : arr) {
			hash.add(a);
		}
		System.out.println(hash);
		System.out.println(s);
		System.out.println(hash1);
		System.out.println(myHash);
		
		

	}

}
