package EQTEch;
import java.util.HashMap;

public class eqtechAlienCalandarSaish {

    public static HashMap monthDayshm = new HashMap();
    public static HashMap monthIndexhm = new HashMap();

    public static HashMap weekNumber = new HashMap();

    public static int [][]calandar;

    public static String []monthsName={"Ra","Ta","Ut","Ip","Ok","Py","Ar","Sy","Du","Fi","Gr"};
    public static int []days={36,39,26,29,31,29,33,34,35,27,43};
    public static int []monthIndexValues = {0,1,2,3,4,5,6,7,8,9,10,11};

    public static void setMonthDaysAndWeek(){

        // map index with month name
        for(int i=0;i<11;i++){
            monthIndexhm.put(monthIndexValues[i],monthsName[i]);
        }

        // map month index with no of days
        for(int i=0;i<11;i++){
            monthDayshm.put(monthIndexValues[i],days[i]);
        }


        // 2
        String []daysNames= {"Za","Xo","Cu","Vo","Bi","Ne","Ma","Lu","Ki"};
        int []dayNumber = {0,1,2,3,4,5,6,7,8};

        for(int i=0;i<9;i++){
            weekNumber.put(dayNumber[i],daysNames[i]);
        }

    }

    public static int MonthStartsOn(){
//        returns the day no
        // return Du
        // predefined method : assuming it to be 6
        return 6;
    }

    public static void generateCalandar(int currentYear,int currentMonth,Boolean isLeap){
        int row;
        int month = currentMonth-1;
        int days;
        // leap
        if (isLeap){
            days = (int) monthDayshm.get(month) + 1;
            //System.out.println("\n ------------- "+days);
        }
        else{
            days = (int) monthDayshm.get(month);
        }

        int statDay= MonthStartsOn();

        // logic to get row count to create a calandar using 2d array
        row = days/9;
        int remainingDays = days%9;
        int temp = remainingDays - (9-statDay);
        if (temp<8){
            row = row + 1 +1;
        }

        System.out.println();
        System.out.println("Month : "+(month+1));
        System.out.println("Is Leap : "+isLeap);
        System.out.println("Days : "+days);

        calandar = new int[row][9];

        // logic to generate calandar
        int write = 1;
        for(int i=0;i<row;i++){
            for(int j=0;j<9;j++){
                if(write<=days){
                    if(i==0 && j<statDay){
                        // calandar[i][j] = 0;
                    }
                    else {
                        calandar[i][j] = write;
                        write++;
                    }
                }
                else {
                    break;
                }
            }
        }

        // logic to print calandar
        System.out.println("Month Name : "+monthIndexhm.get(month) + "\t Current Year "+ currentYear);
        for(int i=0;i<9;i++){
            System.out.print(weekNumber.get(i) + "\t");
        }
        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<9;j++){
                System.out.print(calandar[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        setMonthDaysAndWeek();
        System.out.println(monthDayshm);
        System.out.println(weekNumber);
        PrintNMonths(2717,9,4);
    }

    public static void PrintNMonths(int startYear,int startMonth, int noOfMonths){

        int month;
        int currentMonth = startMonth;
        int currentYear = startYear;

        Boolean isleap;

        for(int i=0;i<noOfMonths;i++){

            currentMonth = startMonth +i;
            if(currentMonth<=11){

            }
            else{
                currentMonth = currentMonth-11;
                currentYear++;

            }
            isleap = checkLeapYear(currentYear);
            generateCalandar(currentYear,currentMonth,isleap);
            System.out.println(i);
        }

    }

    private static Boolean checkLeapYear(int currentYear) {
        Boolean leap = false;
        if(currentYear%11 == 0 && currentYear % 100 !=0 || currentYear % 400 ==0){
            leap = true;
        }
        return leap;
    }

}