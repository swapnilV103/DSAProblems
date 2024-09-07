package Mastercard;

import java.util.Arrays;
import java.util.HashSet;

public class largestIntegerInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = new int[5];
		int[] arr = new int[]{1,2,3,4,1};
		int[] arr1 = new int[]{1,2,3,4,5,1};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		HashSet<Integer> hash = new HashSet<>();
		
		for(int a:arr) {
			System.out.print(a+" ");
			hash.add(a);
		}
		System.out.println();
		System.out.println(hash);
		int b=0,temp = 0;
		for(int a :arr1) {
			
			if(a>b) {
				//temp=a;
				b=a;
				
			}
			
			
		}
		System.out.print(b);
		

		
		
		
		

	}

}
