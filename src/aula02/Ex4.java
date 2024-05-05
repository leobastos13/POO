package aula02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o valor do montante investido em euros: ");
        double montanteInvestido = scanner.nextDouble();
        System.out.print("Coloque o valor da taxa de juros mensal em percentagem: ");
        double taxaJuroMensal = scanner.nextDouble();
        taxaJuroMensal = taxaJuroMensal / 100;
        double valorTotal = montanteInvestido * Math.pow(1 + taxaJuroMensal, 3);
        System.out.println("Ao final de 3 meses, o valor total será de " + valorTotal + ".");
        scanner.close();
    }
}
