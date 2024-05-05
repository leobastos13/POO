package aula03;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int montanteInvestido;
        double taxaJuroMensal;
        
        do {
            System.out.print("Coloque o montante investido ");
            montanteInvestido = scanner.nextInt();

        } while (montanteInvestido <= 0 || montanteInvestido % 1000 != 0);

        do {
            System.out.print("Coloque a taxa de juro mensal ");
            taxaJuroMensal = scanner.nextDouble() / 100;
        } while (taxaJuroMensal < 0 || taxaJuroMensal > 0.05);
        
        double saldo = montanteInvestido;

        for (int i = 1; i <= 12; i++) {
            double juros = taxaJuroMensal * saldo;
            saldo = saldo + juros;
            System.out.println("Mês " + i + ": " + saldo);
        }
        scanner.close();
    }    
}
