package aula05;

import java.util.Scanner;

public class CalenderTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calender calender = null;
        int choice;

        do {
    
            System.out.println("Calendar operations: ");

            System.out.println("1 - create new calender ");
            System.out.println("2 - print calender month ");
            System.out.println("3 - print calender" );
            System.out.println("0 - exit ");

            choice = scanner.nextInt(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();

                    System.out.print("Enter first week day: ");
                    int firstWeekDay = scanner.nextInt();
                    boolean isValid = Calender.validation(year, firstWeekDay);

                    if (!isValid) {
                        System.out.println("Try Again");
                        break;
                    }
                    calender = new Calender(year, firstWeekDay);

                    while (true) {
                        System.out.println("Event:\n1 - add\n2 - remove\n0 - exit");
                        int addEvent = scanner.nextInt();

                        if(addEvent == 0) {
                            break;
                        }
                        System.out.println("Month of event: ");
                        int month = scanner.nextInt();

                        System.out.println("Day of event: ");
                        int day = scanner.nextInt();

                        if (!DateYMD.valid(day, month, calender.year())) {

                            System.out.println("Invalid date ");
                            continue;
                        }
                        DateYMD data = new DateYMD(day, month, calender.year());

                        if (addEvent == 1) {
                            calender.addEvent(data);
                        }

                        if (addEvent == 2) {
                           calender.removeEvent(data); 
                        }
                    }
                    break;

                case 2:
                    
                    if (calender == null) {

                        System.out.println("Create a valid calender");
                        break;
                    }

                    System.out.println("Enter month: ");
                    int month = scanner.nextInt();
                    System.out.print(calender.printMonth(month));
                    break;

                case 3:
                              
                    if (calender == null) {

                        System.out.println("Create a valid calender");
                        break;
                    }

                    System.out.println(calender.toString());
                    break;

                default:
                    break;
            }        
                  
        } while (choice != 0);

        scanner.close();
    } 
}

