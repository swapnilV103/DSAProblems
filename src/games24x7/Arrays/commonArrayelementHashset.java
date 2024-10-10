package games24x7.Arrays;

import java.util.HashSet;

public class commonArrayelementHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Array1 = {1,2,3,4,5};
		int[] Array2 = {3,4,5,6,7};

		HashSet <Integer> common = findcommonElement(Array1,Array2);
		System.out.println(common);
		HashSet<Integer> random = new HashSet<>();
		
		for(int a :Array1) {
			for(int b:Array2) {
				if(a==b) {
					random.add(a);
				}
			}
		}
		
		System.out.println(random);
		

	}

	public static HashSet<Integer> findcommonElement(int[] array1, int[] array2) {
		// TODO Auto-generated method stub

		HashSet<Integer> First = new HashSet<>();
		HashSet<Integer> conElment = new HashSet<>();

		for(int a: array1) {
			First.add(a);
		}

		for(int b: array2) {
			if(First.contains(b)) {
				conElment.add(b);
			}
		}

		return conElment;
	}

}
