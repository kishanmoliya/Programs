import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarr {
    public static void main(String[] args) {
        GregorianCalendar ge = new GregorianCalendar();

        System.out.println("Year is Leap ? = "+ge.isLeapYear(2022));

        System.out.println("Calendar = "+ge.getTime());
        System.out.println("The hashcode of this calendar is = "+ge.hashCode()); 

        System.out.println("Date before rolling = "+ge.getTime());
        ge.roll(Calendar.DATE,false);           
        ge.roll(Calendar.MONTH,true);       //If true then roll up the value by 1.
        ge.roll(Calendar.YEAR,true);        //If false then roll down the value by 1.
        System.out.println("Date after the rollig = "+ge.getTime());

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
    }
}
