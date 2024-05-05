package aula02;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque a quantidade de água em quilogramas: ");
        double quantidadeAgua = scanner.nextDouble();
        System.out.print("Coloque a temperatura inicial em graus Celcius: ");
        double temperaturaInicial = scanner.nextDouble();
        System.out.print("Coloque a temperatura final em graus Celcius: ");
        double temperaturaFinal = scanner.nextDouble();
        double energia = quantidadeAgua * (temperaturaFinal - temperaturaInicial) * 4184;
        System.out.println("A energia necessária para aquecer água desde uma temperatura inicial de " + temperaturaInicial + " graus até uma temperatura final de " + temperaturaFinal + " graus é de " + energia + " Joules.");
        scanner.close();
    } 
}
