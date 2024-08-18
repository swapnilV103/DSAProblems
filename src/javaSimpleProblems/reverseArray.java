package javaSimpleProblems;
import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//half the space complexity and time complexity
		int arr[] = {1,2,3,4,5};
		
		int left = 0;
		int right = arr.length-1;
		int temp = 0;
		int a =2;
		int b= 5;
		
		while(left!=right && left<=right) {
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(a%b);

	}

}
