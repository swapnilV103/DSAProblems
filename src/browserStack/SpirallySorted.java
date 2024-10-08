package browserStack;

public class SpirallySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,3};
		int left=0,right=arr.length-1;
		System.out.println(left);
		System.out.print(right);
		
		for(int i=0;i<arr.length/2;i++) {
			if(arr[left]>arr[right]) {
				System.out.print("Not True");
			}
			
			if(arr[left]<arr[right]) {
				continue;
			}else {
				System.out.print("Not True");
			}
			left++;
			right--;
			
		}

	}

}
