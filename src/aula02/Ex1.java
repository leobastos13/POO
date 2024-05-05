package aula02;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque a distância em quilometros: ");
        double km = scanner.nextDouble();
        double milhas = km / 1.609;
        System.out.println(km + " km são " + milhas + " milhas.");
        scanner.close();
    } 
}

    
    

