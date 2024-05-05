package aula02;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorN;
        do {
            System.out.print("Coloque o valor positivo N: ");
            valorN = scanner.nextInt(); 
        } while (valorN <= 0);
        for (int i = valorN; i > 0; i--) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(" " + i);   
        }
        scanner.close();
    } 
}
