package aula07;

public class Triangulo extends Forma {
    private double lado1;
    private double lado2;
    private double lado3;

     public Triangulo(String cor, double l1, double l2, double l3) {
         super(cor);

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

     public double getArea() {  
        return  Math.sqrt(((lado1 + lado2 + lado3) / 2) * (((lado1 + lado2 + lado3) / 2) - lado1) * (((lado1 + lado2 + lado3) / 2) - lado2) * (((lado1 + lado2 + lado3) / 2) - lado3));
     }

     public double getPerimetro() {           
        return lado1 + lado2 + lado3;
     }

     @Override
     public String toString() {
         return "Triângulo: lados = " + lado1 + ", " + lado2 + ", " + lado3 + ", cor = " + this.getCor();
     }
  
     public boolean equals(Triangulo triangulo) {
         
         if (this.lado1 == triangulo.lado1 && this.lado2 == triangulo.lado2 && this.lado3 == triangulo.lado3 && this.getCor() == triangulo.getCor()) {
             return true;
         }
         return false;
     }   
}
