package aula03;

import java.util.Random;
import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Quantos alunos tem a turma? ");
        int numAlunos = scanner.nextInt();
        double[][] notas = new double[numAlunos][2]; 
        
        for (int i = 0; i < numAlunos; i++) {
            notas[i][0] = (r.nextDouble() * 20 * 10) / 10;
            notas[i][1] = (r.nextDouble() * 20 * 10) / 10;
        }

        System.out.println("NotaT\tNotaP\tPauta");
        for (int i = 0; i < numAlunos; i++) {
            double notaT = notas[i][0];
            double notaP = notas[i][1];
            double notaFinal = notaFinal(notaP, notaT);
            double pauta;


            if (notaFinal < 9.5) {
                 pauta = Math.round(notaFinal); 
            } else {
                 pauta = Math.ceil(notaFinal);
            }
            System.out.printf("%.1f\t%.1f\t%.0f\n", notaT, notaP, pauta);
        }
        scanner.close();   

    } 
    public static double notaFinal(double notaP, double notaT) {
        
        if (notaP < 7.0 || notaT < 7.0) {
            return 66;
        } else {
            return Math.round(0.4 * notaT + 0.6 * notaP);   
        }
        
    }   
    
}
