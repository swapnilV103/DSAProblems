package games24x7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BeginArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"swapy","sush","onkar"};
		int n = 0;
		String[] frinds = new String[4];
		
		ArrayList<String> frandList = new ArrayList<>();
		ArrayList<String> newfrnds  = new ArrayList<>(Arrays.asList("Swapy","saish","onkar","ram"));
		
		System.out.println(newfrnds.size());
		System.out.println(names.length);
		
		
		frandList.add("");
		
		//cant; add items in array
		newfrnds.add("Chetan");
		System.out.println(newfrnds);
		
		
		for(String s: names) {
			System.out.print(s+" ");
		}
		System.out.println(names.toString());
		
		
		newfrnds.add("yoyo");
		newfrnds.set(0, "swapnil");
		System.out.println(newfrnds.get(0));

		System.out.println(Arrays.toString(names));

	}

}
