package InfosysInterviewQuestions;

public class fibonacciSeries {
	
	public static void main(String args[]) {
		int num1= 0;
		int num2 = 1;
		int sum =0;
		
		while(sum<20) {
			System.out.print(num1+" ");
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
	}

}
