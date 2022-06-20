import java.util.*;
class Calendarr{
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();

        System.out.println("Maximum Weak of this year is = "+ca.getMaximum(Calendar.WEEK_OF_YEAR));

        System.out.println("Maximum Day of this year is = "+ca.getMaximum(Calendar.DAY_OF_YEAR));

        System.out.println("Current Date is = "+ca.getTime());

        ca.add(Calendar.YEAR,5);
        System.out.println("After Five Year = " +ca.getTime());
        
        ca.add(Calendar.MONTH,5);
        System.out.println("After Five Month = " +ca.getTime());

        System.out.println("Date = "+ca.get(Calendar.DATE));
        System.out.println("Second = "+ca.get(Calendar.SECOND));
        System.out.println("The time is = "+ca.get(Calendar.HOUR_OF_DAY)+ ":" +ca.get(Calendar.MINUTE)+ ":" +ca.get(Calendar.SECOND));
    }
}