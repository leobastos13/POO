package aula02;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double catetoA, catetoB;
        do {
            System.out.print("Coloque o valor do cateto A: ");
            catetoA = scanner.nextDouble();  
        } while (catetoA <= 0);
        do {
            System.out.print("Coloque o valor do cateto B: ");
            catetoB = scanner.nextDouble();
        } while (catetoB <=0);
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.println("O valor da hipótenusa é " + hipotenusa);
        double angulo = Math.toDegrees(Math.atan(catetoA / catetoB));
        System.out.println("O valor do ângulo da hipótenusa com o cateto A é " + angulo + " graus.");
        scanner.close();      
    } 
}
