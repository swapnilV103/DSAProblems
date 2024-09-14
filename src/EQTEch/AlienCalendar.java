package EQTEch;

public class AlienCalendar {

    static final String[] DAYS = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};
    static final String[] MONTHS = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
    static final int[] DAYS_IN_MONTH = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};
    
    public static void main(String[] args) {
        PrintNMonths(27, 2, 1);
    }
    
    public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths) {
        int monthIndex = startMonth - 1;
        for (int i = 0; i < numberOfMonths; i++) {
            int year = startYear;
            if (monthIndex >= 11) {
                monthIndex = 0;
                year++;
            }
            PrintMonth(year, monthIndex);
            monthIndex++;
        }
    }
    
    public static void PrintMonth(int year, int monthIndex) {
        String monthName = MONTHS[monthIndex];
        int daysInMonth = getDaysInMonth(monthIndex, year);
        int startDay = MonthStartsOn(monthIndex, year);
        
        System.out.println(monthName + " " + year);
        printMonthHeader();
        printMonthDays(startDay, daysInMonth);
        System.out.println("===================================");
    }
    
    public static void printMonthHeader() {
        System.out.print("+");
        for (int i = 0; i < DAYS.length; i++) {
            System.out.print("---+");
        }
        System.out.println();
        
        System.out.print("|");
        for (String day : DAYS) {
            System.out.print(" " + day + " |");
        }
        System.out.println();
        
        System.out.print("+");
        for (int i = 0; i < DAYS.length; i++) {
            System.out.print("---+");
        }
        System.out.println();
    }
    
    public static void printMonthDays(int startDay, int daysInMonth) {
        int currentDay = 1;
        int dayOfWeek = startDay;
        
        System.out.print("|");
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("   |");
        }
        
        while (currentDay <= daysInMonth) {
            System.out.printf(" %2d |", currentDay);
            currentDay++;
            dayOfWeek++;
            if (dayOfWeek == DAYS.length) {
                System.out.println();
                System.out.print("+");
                for (int i = 0; i < DAYS.length; i++) {
                    System.out.print("---+");
                }
                System.out.println();
                if (currentDay <= daysInMonth) {
                    System.out.print("|");
                }
                dayOfWeek = 0;
            }
        }
        
        if (dayOfWeek != 0) {
            while (dayOfWeek < DAYS.length) {
                System.out.print("   |");
                dayOfWeek++;
            }
            System.out.println();
            System.out.print("+");
            for (int i = 0; i < DAYS.length; i++) {
                System.out.print("---+");
            }
            System.out.println();
        }
    }
    
    public static int getDaysInMonth(int monthIndex, int year) {
        int days = DAYS_IN_MONTH[monthIndex];
        if (monthIndex == 8 && isLeapYear(year)) {
            days -= 1;  // Remove one day in Du for leap year
        }
        if (monthIndex == 1 && isSpecialYear(year)) {
            days += 1;  // Add one day in Ta for special years
        }
        return days;
    }
    
    public static boolean isLeapYear(int year) {
        return (year + 1) % 11 == 0;
    }
    
    public static boolean isSpecialYear(int year) {
        int monthCount = (year * 11) + 1;
        return monthCount % 297 == 0;
    }
    
    public static int MonthStartsOn(int monthNum, int yr) {
        // This function is assumed to be provided as per the instructions.
        // Just a placeholder for reference.
        return 0;  // Replace with the actual implementation logic
    }
}
