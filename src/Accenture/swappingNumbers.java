package Accenture;

public class swappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new file added
		int a=3;
		int b=5;
		int c=3;
		int d=5;
		int temp;
		a= a^b;
		System.out.println("A is:"+a);
		b=a^b;
		System.out.println("B is:"+b);
		a=a^b;
		
		temp=c;
		c=d;
		d=temp;
		
		System.out.println("A is:"+a+"    B is: "+b);
		System.out.println("c is:"+c+"   d is: "+d);
		
		

	}

}
