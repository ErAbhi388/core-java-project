package core_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        //java.time package
        LocalDate date = LocalDate.parse("2024-06-14");
        LocalDateTime date1 = LocalDateTime.parse("2024-06-14T00:00:00");
        LocalDate date2 = LocalDate.parse("20240614", DateTimeFormatter.BASIC_ISO_DATE);
        //from the below implementation we can convert a string to any date format
        LocalDate date3 = LocalDate.parse("Jun, 14, 2024", DateTimeFormatter.ofPattern("MMM, dd, yyyy"));
        LocalDate date4 = LocalDate.parse("20240614", DateTimeFormatter.ofPattern("yyyyMMdd"));

        //java.util package
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        String dateInString = "14-Jun-2024";
        Date date5 = formatter.parse(dateInString);

        //setting jvm time zone to gmt
        //TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
       // System.out.println("current time is : "  + LocalDateTime.now());
        //printing dates
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);

        //comparing two dates using equals method
        System.out.println(date3.equals(date4));

       // comparing two dates using compareTo method ---> if it returns 0 then dates are equal
        System.out.println(date3.compareTo(date4));

    }
}
