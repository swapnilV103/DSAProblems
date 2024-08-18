package JatinClassLecture;

public class findMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,2,3,5,6};
		int n = arr1.length+1;
		int Sumation = (n*(n+1))/2;
		int totalResult = 0;
		for(int no:arr1) {
			totalResult = totalResult+no;
		}
		 
		System.out.println("The missing number is: " + (Sumation-totalResult));
	}

}
