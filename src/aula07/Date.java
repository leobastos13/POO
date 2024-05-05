package aula07;
import java.lang.Comparable;

public abstract class Date implements Comparable<Date> {
    

    public static int monthDays(int month, int year) {

        if(month == 2 && leapYear(year)) {
            return 29;

        } else{

            int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
            return months[month-1];
        }
    }

    public static boolean leapYear(int year) {

        if (year % 4 != 0) {
            return true;
        }
        return false;
    }

    public static boolean valid(int day, int month, int year) {
        if (year < 1) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > monthDays(month, year)) {
            return false;
        }
        return true;
    }

    public static boolean validMonth(int month) {

        if(month <= 12) {
           return true;
       }
       return false;
    }

    abstract int getDay();
    abstract int getMonth();
    abstract int getYear();

    @Override
    public int compareTo(Date o) {
        int a = getYear() * 365 + getMonth() * 31 + getDay();
        int b = getYear() * 365 + getMonth() * 31 + getDay();
        return a - b;
    }
}


