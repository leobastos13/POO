package aula08.Ex1;

public abstract class Viaturas implements KmPercorridosInterface {
    private String matricula;
    private String marca;
    private String modelo;
    private double potencia;
    private int quilometrosTotais;
    private int quilometrosAtuais;
    
    public Viaturas(String matricula, String marca, String modelo, Double potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.quilometrosTotais = 0;
        this.quilometrosAtuais = 0;
        
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void trajeto(int quilometros) {
        
        if (quilometros <= 0) {
            System.out.println("Inválido ");
            return;
        }
        this.quilometrosAtuais = quilometros;
        this.quilometrosTotais += quilometros;
    }

    public int ultimoTrajeto() {
        return this.quilometrosAtuais;
    }

    public int distanciaTotal() {
        return this.quilometrosTotais;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Viaturas other = (Viaturas) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Matricula: %s; Marca: %s; Modelo: %s; Potencia: %f",
                this.matricula,
                this.marca,
                this.modelo,
                this.potencia);
    }
}
