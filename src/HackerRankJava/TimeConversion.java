package HackerRankJava;
import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String period = s.substring(8);
    //String hour = s.substring(0,2);
    String name = "8";
    int myName = Integer.parseInt(name);
    //System.out.println(myName);
    int hour = Integer.parseInt(s.substring(0,2));
    String minute = s.substring(3,5);
    String second = s.substring(6,8);
    
    if(period.equals("AM")){
        if(hour==12){
            hour=0;
            
        }
    }
        else{
            if(hour!=12){
                hour+=12;
            }
        }
    
    
    String hourFormatted = String.format("%02d", hour);
    
    return hourFormatted+":"+minute+":"+second;
    
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);
        System.out.println(result);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
