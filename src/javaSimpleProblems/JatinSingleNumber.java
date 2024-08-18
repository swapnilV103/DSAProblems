package javaSimpleProblems;

public class JatinSingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,1,2,4,4};
		int result=0;
		
		for(int index=0;index<=a.length-1;index++) {
			result=result^a[index];
		}
		System.out.println(result);
		
		

	}

}
