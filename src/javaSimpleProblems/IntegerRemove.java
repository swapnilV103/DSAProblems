package javaSimpleProblems;
import java.util.Arrays;

public class IntegerRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[] {1,2,3,4,5};
		
		int key = 2;
		int indextoRemove = -1;
		
		//System.out.println(arr.length);
		
		for(int index=0;index<arr.length;index++) {
			//System.out.print(arr[index]);
			if(arr[index]==key) {
				indextoRemove = index;
				break;
			}
			//System.out.println(index);
		}
		
		int arrNew[] = new int[arr.length-1];
		//int destIndex = 0;
		//System.out.print(Arrays.toString(arr));
		int count =0;
		
		for(int newIndex=0, destIndex=0; newIndex<arr.length;newIndex++) {
			
			if(newIndex!=indextoRemove) {
				arrNew[destIndex]=arr[newIndex];
				destIndex++;	
			}
			System.out.println(count);
			count++;		
			//System.out.print(arrNew[newIndex]);	
		}		
		System.out.print(Arrays.toString(arrNew));

	}

}
