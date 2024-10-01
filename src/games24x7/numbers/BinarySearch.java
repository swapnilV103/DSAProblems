package games24x7.numbers;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,5,7,9,10,11};
		int num =9;
		int result = binarysea(array,num);
		
		
		if(result==-1) {
			System.out.print("not present");
		}
		else {
			System.out.print("present at: "+result);
		}

	}

	public static int binarysea(int[] array, int num) {
		int left = 0;
		int right = array.length-1;
		
		
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(array[mid]==num) {
				return mid;
			}
			if(array[mid]<num) {
				left = mid+1;
			}
			else {
				right=mid-1;
			}
			
		}
		
		
		
		return -1;
		// TODO Auto-generated method stub
		
	}

}
