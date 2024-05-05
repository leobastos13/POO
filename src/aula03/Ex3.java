package aula03;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAleatorio;
        Random r = new Random();

        int tentativa;
        int numtentativas = 0;

        String resposta = "Sim";

        while (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")) {
            
            numAleatorio = r.nextInt(100) + 1;

            do {
                System.out.print("Insira uma tentativa ");
                tentativa = scanner.nextInt();
                numtentativas++;
                
                if (tentativa < numAleatorio) {
                    System.out.println("Tentativa demasiado baixa ");
                    
                } else if ( tentativa > numAleatorio) {
                    System.out.println("Tentativa demasiada alta ");   
                } else {
                    System.out.println("Acertou em " + numtentativas + " tentativas");
                }

            } while (numAleatorio != tentativa); 

            System.out.println("Pretende continuar? ");
            resposta = scanner.next();
        }
            
        scanner.close();
    }
}
