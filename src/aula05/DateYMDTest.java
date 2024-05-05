package aula05;

import java.util.Scanner;

public class DateYMDTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateYMD date = new DateYMD(14, 3, 2023);
        int choice;
    
        do {
        
            System.out.println("Date operations: ");
    
            System.out.println("1 - create new date ");
            System.out.println("2 - show current date ");
            System.out.println("3 - increment date" );
            System.out.println("4 - decrement date ");
            System.out.println("0 - exit ");
    
            choice = scanner.nextInt(); 
                
            switch (choice) {
                case 1:
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
    
                    System.out.print("Enter month: ");
                    int month = scanner.nextInt();
    
                    System.out.print("Enter day: ");
                    int day = scanner.nextInt();
    
                    date = new DateYMD(day, month, year);
                    System.out.println(date);
                    break;
    
                case 2: 
                    System.out.println(date.toString());
                    break;
    
                case 3:
                    date.increment();
                    System.out.println("Date incremented to: " + date.toString());
                    break;
    
                case 4:
                    date.decrement();
                    System.out.println("Date decremented to: " + date.toString());
                    break;
                    
                default:
                    break;
            }        
                      
        } while (choice != 0);
    
        scanner.close();
    }   
        
}

