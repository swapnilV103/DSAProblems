package JatinClassLecture;

public class sumeofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {1,2,3,4,5};
		int sum =0;
		
		for(int i=0; i<arr.length;i++) {
			sum= arr[i]+sum;
			
		}
		
		System.out.print("The sum is: "+sum);

	}

}
