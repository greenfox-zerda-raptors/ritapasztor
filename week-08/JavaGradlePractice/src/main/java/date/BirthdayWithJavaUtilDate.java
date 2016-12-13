package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        return date;
    }

    @Override
    public String printMonthAndDay(Date date) {
        DateFormat format = new SimpleDateFormat("MM. dd.", Locale.ENGLISH);
        String date1 = format.format(date);
        // TODO - return the date formatted: month & day (MM. dd.)
        return date1;
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        Date today = new Date();
        // TODO - return with true if today is the same month+day as date
        return printMonthAndDay(today).equals(printMonthAndDay(date));
    }

    @Override
    public int calculateAgeInYears(Date birthday) {

        DateFormat years = new SimpleDateFormat("yyyy");
        DateFormat monthDay = new SimpleDateFormat("MMdd");
        Date today = new Date();
        int todayYear = Integer.parseInt(years.format(today));
        int birthdayYear = Integer.parseInt(years.format(birthday));
        if (Integer.parseInt(monthDay.format(today)) >= Integer.parseInt(monthDay.format(birthday))) {
            return todayYear - birthdayYear;
        } else {
            return todayYear - birthdayYear - 1;
        }
        // TODO - return how many years age the input date 'birthday' was
    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        int i = (int) new Date().getTime();
        int j = (int) date.getTime();

        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        return -1;
    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
