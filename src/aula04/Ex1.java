package aula04;

import java.util.Scanner;

public class Ex1 {
    
    public static class Circulo {
        private double raio;

        public Circulo(double r) {
            
            if (r <= 0) {
                System.out.println("Tem de ser maior que 0 ");
            } else {
                this.raio = r;
            }
        }

        public double getRaio() {
           return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
        }

        public double getAreaC(double area) {

            area = Math.PI * (Math.pow(raio, 2));
            return area;   
        }

        public double getPerimetroC(double perimetro) {

            perimetro = 2 * Math.PI * raio;
            return perimetro;
        }

        @Override
        public String toString() {
            return "Círculo: raio = " + raio;
        }

       
        public boolean equals(Circulo circulo) {
            
            if (this.raio == circulo.raio) {
                return true;
            }
            return false;
        }
    }

    public static class Triangulo {
       private double lado1;
       private double lado2;
       private double lado3;

        public Triangulo( double l1, double l2, double l3) {
            
            if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
                System.out.println("Tem de ser maior que 0 ");

            } else if ((l1 + l2 <= l3) || (l1 + l3 <= l2) || (l2 + l3 <= l1)) {
                System.out.println("Desigualdade triangular não foi cumprida ");
            
            } else {
                this.lado1 = l1;
                this.lado2 = l2;
                this.lado3 = l3; 
            }  
        }

        public double getLado1() {
            return lado1;
        }

        public double getLado2() {
            return lado2;
        }

        public double getLado3() {
            return lado3;
        }

        public void setLados(double lado1, double lado2, double lado3) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }

        public double getAreaT(double area, double p) {

            p = (lado1 + lado2 + lado3) / 2;
            area = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
            return area;
        }

        public double getPerimetroT(double perimetro) {

            perimetro = lado1 + lado2 + lado3;
            return perimetro;
        }

        @Override
        public String toString() {
            return "Triângulo: lados = " + lado1 + ", " + lado2 + ", " + lado3;
        }
     
        public boolean equals(Triangulo triangulo) {
            
            if (this.lado1 == triangulo.lado1 && this.lado2 == triangulo.lado2 && this.lado3 == triangulo.lado3) {
                return true;
            }
            return false;
        }
    }

    public static class Retangulo {
       private double comprimento;
       private double altura;

        public Retangulo( double c, double a) {
            
            if (c <= 0 && a <= 0) {
                System.out.println("Tem de ser maior que 0 ");
           
            } else {
                this.comprimento = c;
                this.altura = a;
            }
        }

        public double getComprimento() {
            return comprimento;
        }

        public double getAltura() {
            return altura;
        }

        public void setComprimento(double comprimento) {
            this.comprimento = comprimento;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double getAreaR(double area) {

            area = comprimento * altura;
            return area;
        }

        public double getPerimetroR(double perimetro) {

            perimetro = 2 * (comprimento + altura);
            return perimetro;
        }

        @Override
        public String toString() {
            return "Retângulo: comprimento = " + comprimento + ", altura = " + altura;
        }

        public boolean equals(Retangulo retangulo) {
            
            if (this.altura == retangulo.altura && this.comprimento == retangulo.comprimento) {
                return true;
            }
            return false;
        }
    }

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
            System.out.print("Escolhe uma das opções: ");

            System.out.print("1- Círculo; ");
            System.out.print("2- Triângulo; ");
            System.out.print("3- Retângulo; ");

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
                    System.out.print("Coloque o valor do raio do círculo: ");
                    double raio = scanner.nextDouble();
                    cir[numC] = new Circulo(raio);
                    numC++;
                    break;
                
                case 2:
                    System.out.print("Coloque os valores dos lados do triângulo: ");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    double lado3 = scanner.nextDouble();
                    tri[numT] = new Triangulo(lado1, lado2, lado3);
                    numT++;
                    break;
    
                case 3:
                    System.out.print("Coloque o valor do comprimento e da largura do retângulo: ");
                    double comprimento = scanner.nextDouble();
                    double altura = scanner.nextDouble();
                    ret[numR] = new Retangulo(comprimento, altura);
                    numR++;
                    break;
            
                default:
                    System.out.print(" Opção inválida");
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
