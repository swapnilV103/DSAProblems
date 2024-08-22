package SaishQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class arraySamedigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {4,4,5,5,6,6,7,2,4,7,6,4};
		String one = Arrays.toString(array1);
		System.out.print(one);
		
		HashSet<Integer> hash = new HashSet<>();
		for(int s:array1) {
			hash.add(s);
		}
		
		System.out.print(hash);
		

	}

}
