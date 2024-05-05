package aula07;

public class DateYMD extends Date {
    
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

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    } 
    
}
