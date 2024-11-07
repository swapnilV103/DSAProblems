package SaishQuestions;

import java.util.HashMap;

public class paragraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String para = "You have been successfully logged out. You can now close all browser windows";
		
		String[] splitPara =   para.split(" ");
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("You", 0);
		
		
		
		for(String s : splitPara) {
			
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			
			
			
		}
		
		System.out.print(map);
		
		

	}

}
