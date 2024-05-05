package aula02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o valor em graus: ");
        double celcius = scanner.nextDouble();
        double fahrenheit = celcius * 1.8 + 32;
        System.out.println(celcius + " graus Celcius são " + fahrenheit + " graus Fahrenheit.");
        scanner.close();
    }
}
