package aula07;

public class Retangulo extends Forma {
    private double comprimento;
    private double altura;

     public Retangulo(String cor,  double c, double a) {
         super(cor);

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

     public double getArea() {
        return comprimento * altura;
     }

     public double getPerimetro() {
         return 2 * (comprimento + altura) ;
     }

     @Override
     public String toString() {
         return "Retângulo: comprimento = " + comprimento + ", altura = " + altura + ", cor = " + this.getCor();
     }

     public boolean equals(Retangulo retangulo) {
         
         if (this.altura == retangulo.altura && this.comprimento == retangulo.comprimento && this.getCor() == retangulo.getCor()) {
             return true;
         }
         return false;
     }    
}
