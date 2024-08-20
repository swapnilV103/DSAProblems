package games24x7.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

interface car{
	void run();
}


class toyota implements car{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


class animal{
	
}

class dog extends animal{
	void bark() {
		//print("bark");
	}
	
}

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog dog1 = new dog();
		
		//Important
		car myCar = new toyota();
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Hashtable<String, Integer> tab = new Hashtable<String, Integer>();
		Set<Object> s1 = new HashSet<Object>();
		Set<Object> s3 = new HashSet<Object>();
		HashSet<Object> s2 = new HashSet<Object>();
		
		map.put("swapnil", 4);
		map.put("onmi", 5);
		
		tab.put("swapnil", 4);
		tab.put("onmi", 5);
		
		
		
		System.out.println(tab.containsKey("onmi"));
		tab.size();
		s1.size();
		System.out.println(map);
		
		System.out.println(tab.getOrDefault("swapnil",null ));


	}

}
