package aula02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFinal;
        int numInicial;
        int numMaximo = 0;
        int numMinimo = Integer.MAX_VALUE;
        int totalNum = 1;
        System.out.print("Coloque um número: ");
        numInicial = scanner.nextInt();
        int soma = numInicial;
        do {
            System.out.print("Coloque um número: ");
            numFinal = scanner.nextInt();
            totalNum++;
            if (numFinal > numMaximo) {
                numMaximo = numFinal;
            }
            if (numFinal < numMinimo) {
                numMinimo = numFinal;
            }
            soma += numFinal; 
        } while (numFinal != numInicial);
        int media = soma / totalNum;
        System.out.println("Valor máximo: " + numMaximo);
        System.out.println("Valor mínimo: " + numMinimo);
        System.out.println("Valor da média: " + media);
        System.out.println("Total de valores lidos: " + totalNum);
        scanner.close();  
    } 
}
