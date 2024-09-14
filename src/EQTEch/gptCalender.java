package EQTEch;

public class gptCalender {

	   // Days of the week
    private static final String[] WEEK_DAYS = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};

    // Number of days in each month
    private static final int[] MONTH_DAYS = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43}; // Ra to Gr

    public static void main(String[] args) {
        PrintNMonths(0, 1, 3); // Change parameters as needed for testing
    }

    public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths) {
        for (int i = 0; i < numberOfMonths; i++) {
            int currentMonth = (startMonth + i - 1) % 11; // Loop through months
            int currentYear = startYear + (startMonth + i - 1) / 11; // Adjust year accordingly

            printMonth(currentYear, currentMonth);
        }
    }

    private static void printMonth(int year, int month) {
        // Get the name of the month
        String monthName = getMonthName(month);

        // Adjust days for leap years and special conditions
        int daysInMonth = getDaysInMonth(month, year);

        // Get the day the month starts on
        int startDay = MonthStartsOn(month, year);

        // Print month name and year
        System.out.println(monthName + " " + year);
        printSeparator();

        // Print day names
        printDayNames();

        // Print the days grid
        printDaysGrid(startDay, daysInMonth);
        System.out.println();
        printSeparator();
        System.out.println();
    }

    private static String getMonthName(int month) {
        String[] monthNames = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
        return monthNames[month];
    }

    private static int getDaysInMonth(int month, int year) {
        // Handle special condition for Ta (every 297 months, 1 day is added)
        if (month == 1 && (year * 11 + month) % 297 == 0) {
            return MONTH_DAYS[month] + 1; // Ta has 40 days
        }
        // Handle leap year logic (every 11 years, 1 day is removed from Du)
        if (month == 8 && year % 11 == 0) {
            return MONTH_DAYS[month] - 1;
        }
        return MONTH_DAYS[month];
    }

    private static void printSeparator() {
        System.out.println("+---+---+---+---+---+---+---+---+---+");
    }

    private static void printDayNames() {
        System.out.print("|");
        for (String day : WEEK_DAYS) {
            System.out.print(" " + day + " |");
        }
        System.out.println();
        printSeparator();
    }

    private static void printDaysGrid(int startDay, int daysInMonth) {
        int dayCounter = 1;
        int currentDay = startDay;

        // First row: Fill in the first week
        System.out.print("|");
        for (int i = 0; i < 9; i++) {
            if (i < startDay) {
                System.out.print("    |");
            } else {
                System.out.printf(" %2d |", dayCounter++);
            }
        }
        System.out.println();
        printSeparator();

        // Continue filling the grid with remaining weeks
        while (dayCounter <= daysInMonth) {
            System.out.print("|");
            for (int i = 0; i < 9; i++) {
                if (dayCounter <= daysInMonth) {
                    System.out.printf(" %2d |", dayCounter++);
                } else {
                    System.out.print("    |");
                }
            }
            System.out.println();
            printSeparator();
        }
    }

    // Mock of the given method. You need to replace it with actual logic.
    private static int MonthStartsOn(int monthNum, int yr) {
        // This is a mock function; replace it with actual logic as needed.
        return (monthNum + yr) % 9; // Just for example, actual logic might be different.
    }
}
