package aula04;

import java.util.Scanner;

public class CarDemo {

    static Scanner sc = new Scanner(System.in);
    
    static int registerCars(Car[] cars) {

        int carsCount = 0;
        String userCars = "";

        do {

            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            userCars = sc.nextLine();

            if (userCars == "") {
                return carsCount;
            }

            String[] carParts = userCars.split(" ");

            if (carParts.length < 4) {
                continue;   
            }
            String make = carParts[0];
            String model = carParts[1];
            int year = Integer.parseInt(carParts[2]);
            int kms = Integer.parseInt(carParts[3]);

            cars[carsCount] = new Car(make, model, year, kms);
            carsCount++;
            
        } while (userCars != "");

        return carsCount; 
    }
    
    static void registerTrips(Car[] cars, int carsCount) {

        String userTrip = "";

        do {

            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            userTrip = sc.nextLine();
            String[] trips = userTrip.split(":");

            if (trips.length < 2) {
                continue;
            }
            int id = Integer.parseInt(trips[0]);
            int carDistance = Integer.parseInt(trips[1]);
            cars[id].drive(carDistance);
            
            
        } while (userTrip != "");
           
    }
    
    static void listCars(Car[] cars, int carsCount) {

        String carList = "";
        System.out.println("\nCarros registados: ");

        for (int i = 0; i < carsCount; i++) {
            carList += cars[i].toString();
        }

        System.out.println(carList);
    }
    
    public static void main(String[] args) {
    
        Car[] cars = new Car[10];
    
        int carsCount = registerCars(cars);
    
        if (carsCount > 0) {
            listCars(cars, carsCount);
            registerTrips(cars, carsCount);
            listCars(cars, carsCount);
         }
    
        sc.close();
    
    }
}

