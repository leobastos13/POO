package aula05;

public class Calender {
    private int[][] events = new int[12][31];
    private int year;
    private int firstWeekdayOfYear;
    

    public Calender(int year, int firstWeekdayOfYear) {
        this.year = year;
        this.firstWeekdayOfYear = firstWeekdayOfYear;

        
        
    }

    public int year() {
        return this.year;
    }

    public int firstWeekdayOfYear() {
        return this.firstWeekdayOfYear;
    }

    public int firstWeekdayOfMonth(int month) {
       int totalDays = 0;
       int firstWeekdayOfMonth;

       for (int i = 0; i < month; i++) {
        totalDays += DateYMD.monthDays(i, this.year);
       }

       firstWeekdayOfMonth = (totalDays % 7) + 1;
       return firstWeekdayOfMonth;
    }

    public void addEvent(DateYMD date) {
        events[date.getMonth()- 1][date.getDay() - 1]++;
    }

    public void removeEvent(DateYMD date) {
        if (events[date.getMonth()- 1][date.getDay() - 1] <= 0) {
            return;
        }
        events[date.getMonth()- 1][date.getDay() - 1]--;
    }

    public String printMonth(int month) {
        int currentWeekDay = firstWeekdayOfMonth(month);
        int totalMonthDays = DateYMD.monthDays(month, this.year);
        String result = "";

        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        String monthnames= months[month];

        result += String.format("%12s %6d\n", monthnames, this.year);
        result += " Su  Mo  Tu  We  Th  Fr  Sa\n";

        for (int i = 1; i < currentWeekDay; i++) {
            result += "    ";
        }

        for (int i = 1; i <= totalMonthDays; i++) {

            if (events[month - 1][i - 1] > 0) {
                result += String.format(" %2d", i);
                
            } else {
                result += String.format(" %4d", i);
            }
            currentWeekDay++;

            if (currentWeekDay > 7 ) {  
                result += "\n"; 
                currentWeekDay = 1;           
            }

        }
        result += "\n"; 
        return result;    
    }

    public String toString() {
        String result = "";

        for (int i = 0; i <= 12; i++) {
            result += printMonth(i);
        }
        return result;
    }

    public static boolean validation(int year, int weekDay) {

        if (year >= 1000 && weekDay >= 1 && weekDay <= 7) {
            return true;
        }
        return false;
    }

   

    
}

    
