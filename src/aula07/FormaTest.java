package aula07;

import java.util.Scanner;

public class FormaTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Circulo[] cir = new Circulo[2];
        Triangulo[] tri = new Triangulo[2];
        Retangulo[] ret = new Retangulo[2];
        int numC = 0;
        int numT = 0;
        int numR = 0;

        do {
            if (numC == 2 && numR == 2 && numT == 2) {
                break;
            }
            System.out.println("Escolhe uma das opções: ");

            System.out.println("1- Círculo; ");
            System.out.println("2- Triângulo; ");
            System.out.println("3- Retângulo; ");

            int escolha = scanner.nextInt();

            if (escolha == 1 && numC >= 2) {
                System.out.println("Limite atingido ");
                escolha = 0;
            }

            if (escolha == 2 && numT >= 2) {
                System.out.println("Limite atingido ");
                escolha = 0;
            }

            if (escolha == 3 && numR >= 2) {
                System.out.println(" Limite atingido ");
                escolha = 0;
            }

            switch (escolha) {

                case 1:
                    System.out.println("Coloque o valor do raio do círculo: ");
                    double raio = scanner.nextDouble();

                    System.out.println("Coloque a cor: ");
                    String corC = scanner.next();

                    cir[numC] = new Circulo(corC, raio);
                    numC++;
                    break;
                
                case 2:
                    System.out.println("Coloque os valores dos lados do triângulo: ");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    double lado3 = scanner.nextDouble();

                    System.out.println("Coloque a cor: ");
                    String corT = scanner.next();

                    tri[numT] = new Triangulo(corT, lado1, lado2, lado3);
                    numT++;
                    break;
    
                case 3:
                    System.out.print("Coloque o valor do comprimento e da largura do retângulo: ");
                    double comprimento = scanner.nextDouble();
                    double altura = scanner.nextDouble();

                    System.out.println("Coloque a cor: ");
                    String corR = scanner.next();

                    ret[numR] = new Retangulo(corR, comprimento, altura);
                    numR++;
                    break;
            
                default:
                    System.out.println(" Opção inválida");
                    break;   
            }

        } while ( numC <= 2 || numT <= 2 || numR <= 2);

        System.out.println(cir.length);
        for (int i = 0; i < cir.length; i++) { 

            System.out.println(cir[i].toString());   
        }
        System.out.println(" Circulo 1 == Circulo 2: " + cir[0].equals(cir[1]));
        
        for (int i = 0; i < tri.length; i++) { 

            System.out.println(tri[i].toString());   
        }
        System.out.println(" Triangulo 1 == Triangulo 2: " + tri[0].equals(tri[1]));

        for (int i = 0; i < ret.length; i++) { 

            System.out.println(ret[i].toString());   
        }
        System.out.println(" Retangulo 1 == Retangulo 2: " + ret[0].equals(ret[1]));

        scanner.close();        
    }
}

    

