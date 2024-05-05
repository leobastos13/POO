package aula02;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o valor da coordenada x do p1: ");
        double xp1 = scanner.nextDouble();
        System.out.print("Coloque o valor da coordenada y do p1: ");
        double yp1 = scanner.nextDouble();
        System.out.print("Coloque o valor da coordenada x do p2: ");
        double xp2 = scanner.nextDouble();
        System.out.print("Coloque o valor da coordenada y do p2: ");
        double yp2 = scanner.nextDouble();
        double distancia = Math.sqrt(Math.pow(xp2 -xp1, 2) + Math.pow(yp2 - yp1, 2));
        System.out.println("A distância é " + distancia + ".");
        scanner.close();     
    } 
}
