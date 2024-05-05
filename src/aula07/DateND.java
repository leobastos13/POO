package aula07;

public class DateND extends Date {
    private int distance;

    public DateND(int distance) {

        if (distance < 0) {
            System.out.println("Opção inválida");    
        }
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {

        if (distance < 0) {
            System.out.println("Opção inválida");    
        }
        this.distance = distance;
    }

    public DateYMD toDateYMD() {
        int days = distance;
        int year = 2000;
        int month = 1;
        int monthDay = 1;

        while (days > 0) {
            int daysInYear = leapYear(year) ? 366 : 365;

            if (days >= daysInYear) {
                days -= daysInYear;
                year++;

            } else {
                int[] daysInMonth = {31, leapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                for (int i = 0; i < 12; i++) {
                    int daysInCurrentMonth = daysInMonth[i];

                    if (days >= daysInCurrentMonth) {
                        days -= daysInCurrentMonth;
                        month++;

                    } else {
                        monthDay += days;
                        days = 0;
                        break;
                    }
                }
            }
        }
        
        return new DateYMD(year, month, monthDay);
    }

    @Override
    public String toString() {
        DateYMD date = toDateYMD();
        return String.format("%04d-%02d-%02d", date.getYear(), date.getMonth(), date.getDay());
    }

    @Override
    int getDay() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDay'");
    }

    @Override
    int getMonth() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMonth'");
    }

    @Override
    int getYear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getYear'");
    }

    
}


