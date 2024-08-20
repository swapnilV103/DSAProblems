package games24x7.numbers;

public class fibonacchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		fibo(num);
		

	}

	public static void fibo(int num) {
		// TODO Auto-generated method stub
		int num2= 1;
		int num1 = 0;
		
		for(int i=0;i<=num;i++) {
			System.out.print(num1+" ");
			int next=num1+num2;
			num1=num2;
			num2=next;
			
		}
		
		
		
	}

}
