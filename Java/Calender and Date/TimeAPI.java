import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TimeAPI{
    public static void main(String[] args) {
        Clock c1 = Clock.systemDefaultZone();
        System.out.println(c1.getZone());

        Clock c2 = Clock.systemUTC();
        System.out.println(c2.instant());

        System.out.println();
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);    //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
        System.out.println(d1.isNegative());
        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);     //LocalTime.MAX = '23:59:59.9999999' , LocalTime.MIN = '00:00'
        System.out.println(d2.isNegative());
        
        System.out.println();
        LocalDate l1 = LocalDate.parse("2022-06-15");
        LocalDate l2 = LocalDate.parse("2022-06-15");
        LocalDate l3 = LocalDate.parse("2022-06-16");
        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l3));

        System.out.println();
        LocalDate loc = LocalDate.parse("2022-06-15");
        System.out.println(loc.withMonth(7));
        System.out.println(loc.withYear(2030));

        System.out.println();
        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalTime t1 = t.plusHours(7);       
        System.out.println("After adding Hours = "+t1);

        LocalTime lo1 = LocalTime.of(5,28,19);
        System.out.println(lo1);
        LocalTime lo2 = lo1.plusMinutes(50);
        System.out.println("After adding Minutes = "+lo2);


        System.out.println();
        LocalTime ti = LocalTime.now();
        System.out.println(ti);

        System.out.println();
        LocalDate lo = LocalDate.now();
        System.out.println(lo);

        System.out.println();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

    }
}