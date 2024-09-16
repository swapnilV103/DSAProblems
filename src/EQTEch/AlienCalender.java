package EQTEch;


public class AlienCalender{

private static final String[] days = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};
private static final String[] months = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
private static final int[] daysIn_Months ={36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};

private static final int totalMonthsInYear= 11;
private static final int additional_Day= 297;
static int a;



  public static void main(String[] args){
     PrintNMonths(27, 2, 10);

  }

  


  public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths){
  
   if(startYear<0 || startYear>6999 || startMonth<1 || startMonth>11){
     System.out.println("Please Provide valid Input");
   }else {
	   int currentYear = startYear;
	   int currentMonth = startMonth-1;
	   int currentDayOfWeek = MonthStartsOn(startMonth,startYear);
	   
	   for(int i=0; i<numberOfMonths; i++){
		  
	      printMonth(currentYear,currentMonth,currentDayOfWeek);
	      currentDayOfWeek=a;
	      currentMonth++;
	        if(currentMonth ==11){
	          currentMonth=0;
	          currentYear++;
	        }
	   } 
   }

    //for loop ends
 }    //PrintNMonths ends






 public static void printMonth(int year, int month, int currentDayOfWeek){
	 
	 
   String monthName = months[month];
   int totalDaysInMonth = daysIn_Months[month];
   
   int monthsSinceYear0 = (year * totalMonthsInYear) + month;
  // System.out.println(monthsSinceYear0);
   //System.out.println(monthsSinceYear0 % additional_Day);
   //System.out.println(month);

   
 
   if(month==1 && (monthsSinceYear0 % additional_Day==1)){
     totalDaysInMonth++;
 }else if(month == 8 && year%totalMonthsInYear ==0){
     totalDaysInMonth--;
 }
 
   System.out.println(monthName + " " + year);
   System.out.println();
   printMonthHeader();
   //System.out.println();
   //System.out.println(" Za | Xo | Cu | Vo | Bi | Ne | Ma | Lu | Ki |");

 
   //int currentDayOfWeek = MonthStartsOn(month,year);
   System.out.print("");

   for(int day = 1; day <= totalDaysInMonth; day++){
	   
	   if( currentDayOfWeek!=0&&day==1) {
		   for(int i = 0;i<currentDayOfWeek;i++) {
			   System.out.printf("|    ");
		   }
		  
	   }
	  
	 
      System.out.printf("| %2d ", day);
      
       currentDayOfWeek++;
        if(currentDayOfWeek == 9){
          System.out.print("|");
          System.out.println();
          printMonthSeparator();
         currentDayOfWeek = 0; 
        }
   }
   
   if(currentDayOfWeek!=9 && currentDayOfWeek != 0) {
	   for(int i=0;i<=9-currentDayOfWeek;i++) {
		   System.out.print("|    ");
	   }
	   
   }
  
   
   
        if (currentDayOfWeek != 0) {
           System.out.print("");
           System.out.println(); 
           printMonthSeparator();
        }
        System.out.println();
        System.out.println("=============================================");
        System.out.println();

        a=currentDayOfWeek;
 }//printMonth ends

 
 
 
 public static void printMonthHeader() {
     printMonthSeparator();
     System.out.print("|");
     for(String day : days) {
        System.out.print(" " + day + " |");
     }
     System.out.println();
     printMonthSeparator();
 }

 public static void printMonthSeparator(){
     System.out.print("+");
     for(int i = 0; i < days.length; i++){
         System.out.print("----+");
     }
     System.out.println();
 }




 public static int MonthStartsOn(int month, int year){
   //This method is supposed to be kept empty as per the email
  return 4;
 }



}

