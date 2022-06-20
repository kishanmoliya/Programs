import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateFormate {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is = "+dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //You can set many date time formate.
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;   //ISO date format
        DateTimeFormatter df3 = DateTimeFormatter.ISO_WEEK_DATE;   


        String mydate = dt.format(df);   //Creating date string using date and formate
        String mydate1 = dt.format(df1);
        String mydate2 = dt.format(df2);
        String mydate3 = dt.format(df3);
        System.out.println("Date after formating = "+mydate);
        System.out.println("Date in different formate = "+mydate1);
        System.out.println("Date in ISO format = "+mydate2);
        System.out.println("Date in ISO_WEEK_DATE formate = "+mydate3);

        

    }
}
