package EQTEch;

public class calender {

    // Number of days in each month
    private static final int[] DAYS_IN_MONTH = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};
    private static final String[] MONTH_NAMES = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
    private static final String[] WEEK_DAYS = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};

    public static void main(String[] args) {
        PrintNMonths(2717, 9, 4);
    }

    public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths) {
        for (int i = 0; i < numberOfMonths; i++) {
            int year = startYear + (startMonth - 1 + i) / 11;
            int month = (startMonth - 1 + i) % 11;

            printMonth(year, month);
        }
    }

    private static void printMonth(int year, int month) {
        int daysInMonth = getDaysInMonth(year, month);
        int startDay = MonthStartsOn(month, year);

        System.out.println("+----------------------------+");
        System.out.printf("|%10s %4d           |\n", MONTH_NAMES[month], year);
        System.out.println("| Za Xo Cu Vo Bi Ne Ma Lu Ki  |");
        System.out.println("+----------------------------+");

        // Print the days of the month
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + startDay) % 9 == 0 || day == daysInMonth) {
                System.out.println("|");
                if (day != daysInMonth) {
                    System.out.print("| ");
                }
            }
        }

        // Fill in the remaining days of the last week if needed
        int remainingDays = (daysInMonth + startDay) % 9;
        if (remainingDays != 0) {
            for (int i = remainingDays; i < 9; i++) {
                System.out.print("    ");
            }
            System.out.println("|");
        }

        System.out.println("+----------------------------+");
    }

    private static int getDaysInMonth(int year, int month) {
        int days = DAYS_IN_MONTH[month];

        if (month == 9 && year % 11 == 0) {
            days--;  // Remove a day from Du every 11 years
        }

        if (month == 1 && (year * 11 + month) % 297 == 0) {
            days++;  // Add a day to Ta every 297 months
        }

        return days;
    }

    // Dummy method for MonthStartsOn, to be implemented as per actual logic
    public static int MonthStartsOn(int monthNum, int yr) {
        // Implement the logic here
        return 0; // Placeholder return
    }
}
