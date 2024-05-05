package aula07;

public class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double r) {
        super(cor);
        
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

    
    public double getArea() {  
        return  Math.PI * (Math.pow(raio, 2));   
    }

    public double getPerimetro() { 
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Círculo: raio = " + raio + ", cor =" + this.getCor();
    }

   
    public boolean equals(Circulo circulo) {
        
        if (this.raio == circulo.raio && this.getCor() == circulo.getCor()) {
            return true;
        }
        return false;
    }    
}
