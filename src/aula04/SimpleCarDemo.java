
package aula04;
import java.util.Scanner;
public class SimpleCarDemo {
    
    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {

        System.out.println("\nCarros registados: ");

        for (int i = 0; i < cars.length; i++) {
            
            if (cars != null) {
                System.out.println(cars[i].toString());
            }
        } 
        System.out.println();  
    }
    

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car("Renault", "Megane Sport Tourer", 2015, 35356); 
        cars[1] = new Car("Toyota",  "Camry", 2010, 32456);
        cars[2] = new Car("Mercedes", "Vito", 2008, 273891);

        listCars(cars);

        
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); 
            int kms = (int)Math.round(Math.random()*1000); 
            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
            
            cars[j].drive(kms);
        }

        listCars(cars);

        sc.close();

    }
}

