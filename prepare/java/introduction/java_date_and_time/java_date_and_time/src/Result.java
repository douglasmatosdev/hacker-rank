import java.util.Calendar;

public class Result {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        calendar.set(year, month - 1, day, 0, 0);;
        int number_week_day = calendar.get(Calendar.DAY_OF_WEEK);
        return days[number_week_day-1].toUpperCase();
    }
}
