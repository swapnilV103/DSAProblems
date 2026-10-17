package browserStack;

import java.util.Arrays;

public class SpirallySorted {

	public static boolean spiralSort(int[] arr){
		int start=0;
		int end = arr.length-1;
		int prev = Integer.MIN_VALUE;

		for(int i=start; i<=end/2;i++){
			if(arr[i]<prev){
				return false;
			}
			prev = arr[i];
			start++;

			if(start<=end){
				if(arr[end]<prev){
					return false;
				}
				prev=arr[end];
				end--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,3,4,2};
		int[] arr2 ={1,2,3,4};
		String a= "swa";
		a.length();
		//for sorting you can use Arrays.sort(arr1); 
		//for printing Arrays.toString(arr2)
		System.out.println(arr1.toString()+"Is spirally sorted?"+spiralSort(arr2));
		//System.out.println();
	}

}
