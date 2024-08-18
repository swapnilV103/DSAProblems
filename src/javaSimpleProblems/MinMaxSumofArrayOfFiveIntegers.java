package javaSimpleProblems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections;


public class MinMaxSumofArrayOfFiveIntegers {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();
        //Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrTemp.length; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }
        
       /* for (int i = 0; i < arr.size(); i++) {
            //int arrItem = Integer.parseInt(arrTemp[i]);
        	int num = scanner.nextInt();
            arr.add(num);
        }*/
        
        
       // Scanner scanner = new Scanner(System.in);

        // Use a loop to dynamically add elements based on user input
        //System.out.println("Enter integers to add to the array. Enter a non-integer to stop.");

        /*while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            arr.add(userInput);
        }*/
        miniMaxSum(arr);

        bufferedReader.close();
    }
	
	
	 public static void miniMaxSum(List<Integer> arr) {
		    // Write your code here
		    //System.out.println(arr.size());
		 
		    Collections.sort(arr);
		    int sum = 0;
		    for(int index =0;index<arr.size()-1;index++) {
		    	sum = sum+arr.get(index);
		    	
		    }
		    
		    int bigSum=0;
		    
		    for(int bigIndex=1;bigIndex<arr.size();bigIndex++) {
		    	bigSum = bigSum+arr.get(bigIndex);
		    }	    
		    //long minSum = (long) arr.get(0)+arr.get(1)+arr.get(2)+arr.get(3);
		    //long maxSum = (long) arr.get(1)+arr.get(2)+arr.get(3)+arr.get(4);
		    
		    //System.out.println(minSum+" "+maxSum);
		    System.out.println(sum+" "+bigSum);
		    //System.out.println(arr.size());
		    
		    }

}


