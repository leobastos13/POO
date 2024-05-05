package aula03;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Coloque um numero ");
            num = scanner.nextInt();
        } while (num <= 0);
        int soma = 0;
        for (int i = 1; i <= num ; i++) {
            if (setPrimos(i)) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
        scanner.close();
    } 
    
    public static boolean setPrimos(int primo ) {
        for (int i = 2; i < primo; i++) {
            if (primo % i == 0) {
                return false;    
            }
        }
        return true;
    }     
}

