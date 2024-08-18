package javaSimpleProblems;
import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

class RatioOfIntegers {
	
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        plusMinus(arr);

        bufferedReader.close();
    }

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    	
    // Write your code here
    double positiveCount =0;
    double negativeCount =0;
    double zeroCount = 0;
    
    
    for(int num :arr){
        if (num>0){
            positiveCount++;
        }
        else if(num<0){
            negativeCount++;
        }
        else{
            zeroCount++;
        }
        
    }
    
    //System.out.println(arr.size());
    double positiveRatio =  positiveCount/arr.size();
    double negativeRatio =  negativeCount/arr.size();
    double zeroRatio = zeroCount/arr.size();
    
    System.out.println(positiveRatio);
    System.out.println(negativeRatio);
    System.out.println(zeroRatio);
    
    

    }
    

}


