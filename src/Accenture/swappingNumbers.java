package Accenture;

public class swappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3;
		int b=5;
		int c=3;
		int d=5;
		int temp;
		a= a^b;
		b=a^b;
		a=a^b;
		
		temp=c;
		c=d;
		d=temp;
		System.out.print("A is:"+a+"   B is: "+b);
		System.out.print("c is:"+c+"   d is: "+d);
		
		

	}

}
