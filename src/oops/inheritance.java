package oops;
interface car{
	void run();
	void stop();
}
abstract class toyota implements car {
	public void run() {
		System.out.println("toyota is running");
	}
}

class toyotaCorella extends toyota{	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("toyotaCorella is running");	
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("toyotaCorella is stopping");		
	}	
}
class fiat implements car{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("fiat is running");
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("fiat is stopping");		
		}
	}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fiat fi  = new fiat();
		car ca = new fiat();
		toyotaCorella cor = new toyotaCorella();
		toyota toy = new toyotaCorella();
		
		fi.run();
		ca.run();

		cor.run();
		toy.run();
		
	}

}
