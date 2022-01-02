import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This Java class Shows the implementation of several Date and DateTime formats, with their names printed with them.
 * All the work has been done in the main method of the class.
 */
public class Time {
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.now();
        DateTimeFormatter formatter;

        // Date Formats...
        formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
        System.out.println("Ordinal Date : "+date.format(formatter));
        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println("Local Date : "+date.format(formatter));
        formatter = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println("Basic Date : "+date.format(formatter));
        formatter = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println("Week Date : "+date.format(formatter));
        formatter = DateTimeFormatter.ISO_DATE;
        System.out.println("Date : "+date.format(formatter));

        System.out.println();
        // Time Formats...
        LocalDateTime dateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("Ordinal Datetime : "+dateTime.format(formatter));
        formatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("Basic Datetime : "+dateTime.format(formatter));
        formatter = DateTimeFormatter.ISO_TIME;
        System.out.println("Week Datetime : "+dateTime.format(formatter));
        formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println("Datetime : "+dateTime.format(formatter));
    }
}
