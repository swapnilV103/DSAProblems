package EQTEch;

import java.util.*;

public class CalendarRaa {

    // Define constants for month names and days
    private static final String[] DAY_NAMES = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};
    private static final String[] MONTH_NAMES = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
    private static final int[] DAYS_IN_MONTH = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};
    private static final int YEAR_CYCLE = 11;
    private static final int ADDITIONAL_DAY_CYCLE = 297;

    public static void main(String[] args) {
        // Example usage: PrintNMonths(2717, 9, 4)
        PrintNMonths(2723, 2, 300);
    }

    public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths) {
        if (startYear < 0 || startYear > 6999 || startMonth < 1 || startMonth > 11) {
            System.out.println("Invalid input. Please provide valid values for year and month.");
            return;
        }

        int currentYear = startYear;
        int currentMonth = startMonth - 1; // Adjust to 0-based index

        for (int i = 0; i < numberOfMonths; i++) {
            printMonth(currentYear, currentMonth);

            // Move to the next month
            currentMonth++;
            if (currentMonth == 11) {
                currentMonth = 0;
                currentYear++;
            }
        }
    }

    public static void printMonth(int year, int month) {
        String monthName = MONTH_NAMES[month];
        int daysInMonth = DAYS_IN_MONTH[month];

        // Adjust days for special years
        if (month == 1 && ((year * 11 + month) % ADDITIONAL_DAY_CYCLE == 0)) {
            daysInMonth++; // Add extra day to Ta month
        } else if (month == 8 && (year % YEAR_CYCLE == 0)) {
            daysInMonth--; // Remove day from Du every 11 years
        }

        System.out.println( monthName +" " + year);
        System.out.println("Za Xo Cu Vo Bi Ne Ma Lu Ki"); // Days of the week header

        int currentDayOfWeek = 0; // Start from "Za"
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            currentDayOfWeek++;
            if (currentDayOfWeek == 9) {
                currentDayOfWeek = 0;
                System.out.println();
            }
        }
        if (currentDayOfWeek != 0) {
            System.out.println();
        }
        System.out.println("===================================");
    }
}
 