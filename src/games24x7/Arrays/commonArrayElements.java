package games24x7.Arrays;

import java.util.HashSet;
import java.util.Set;

public class commonArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] FirstArray = {1,2,3,4,5};
		int[] SecondArray = {3,4,5,6,7};
		
		Set<Integer> comm = findCommonElements(FirstArray,SecondArray);
		//findCommonElements(FirstArray,SecondArray);
		System.out.print(comm);

	}

	private static Set<Integer> findCommonElements(int[] firstArray, int[] secondArray) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonElements = new HashSet<>();
		
		for(int a: firstArray) {
			set1.add(a);
		}
		
		for(int b: secondArray) {
			if(set1.contains(b)) {
				commonElements.add(b);
			}
		}
		
		return commonElements;
		
	}

}
