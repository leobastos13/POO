package aula02;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v1, v2 , d1, d2;
        do {
            System.out.print("Coloque o valor da velocidade v1: ");
            v1 = scanner.nextDouble();
        } while (v1 <= 0);
        do {
            System.out.print("Coloque o valor da distância d1 ");
            d1 = scanner.nextDouble();
        } while (d1 <= 0);
        do {
            System.out.print("Coloque o valor da velocidade v2: ");
            v2 = scanner.nextDouble();
        } while (v2 <= 0);
        do {
            System.out.print("Coloque o valor da distância d2: ");
            d2 = scanner.nextDouble();
        } while (d2 <= 0);
        double media = (d1 + d2) / ((d1 / v1) + (d2 / v2));
        System.out.println("A velocidade média é de " + media + ".");
        scanner.close();
    }
}
