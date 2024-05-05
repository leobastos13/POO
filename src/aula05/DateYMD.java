package aula05;
    
public class DateYMD {
    
    private int day;
    private int month;
    private int year;

    public DateYMD(int day, int month, int year) {
        set(day,month,year);
    }

    public void set(int day, int month, int year) {

       if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;

        } else {
            System.out.println("Opção Inválida");
        }
    }

    public static boolean validMonth(int month) {

         if(month <= 12) {
            return true;
        }
        return false;
    }

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

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    } 

    public void increment() {

        if (day < monthDays(month, year)) {
            day++;

        } else {
            day = 1;

            if (month < 12) {
                month++;

            } else {
                month = 1;
                year++;
            }
        }
    }

    public void decrement() {

        if (day > 1) {
            day--;

        } else {

            if (month > 1) {
                month--;
                day = monthDays(month, year);

            } else {
                month = 12;
                year--;
                day = monthDays(month, year);
            }
        }
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
}


