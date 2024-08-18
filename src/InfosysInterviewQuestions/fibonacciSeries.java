package InfosysInterviewQuestions;

public class fibonacciSeries {
	
	public static void main(String args[]) {
		int num1= 0;
		int num2 = 1;
		int sum =0;
		
		while(sum<20) {
			sum=sum+num2;
			System.out.print(sum+" ");
			num2=sum;
		}
		
	}

}
