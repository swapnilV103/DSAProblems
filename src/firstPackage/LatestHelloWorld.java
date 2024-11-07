package firstPackage;
/*
public class LatestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		employeeID();
	}
	public static int employeeID() {
		Integer empId = 1001;
		System.out.println("inside employeeID");
		return empId;	
	}
}
*/
//Java program to demonstrate Unboxing
import java.util.ArrayList;

class LatestHelloWorld {
	public static void main(String[] args)
	{
		//Character ch = 'a';

		// unboxing - Character object to primitive
		// conversion
		//char a = ch;

		ArrayList<Integer> arrayList
			= new ArrayList<Integer>();
		arrayList.add(24);

		// unboxing because get method returns an Integer
		// object
		int num = arrayList.get(0);
	

		// printing the values from primitive data types
		System.out.println(num);
	}
}
