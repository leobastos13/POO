package aula09.Ex3;

public abstract class Plane {
    protected String identificador;
    protected String fabricante;
    protected String modelo;
    protected int anoProducao;
    protected int numMaxPassageiros;
    protected int velocidadeMax;

    public Plane(String identificador, String fabricante, String modelo, int anoProducao, int numMaxPassageiros, int velocidadeMax) {
        this.identificador = identificador;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoProducao = anoProducao;
        this.numMaxPassageiros = numMaxPassageiros;
        this.velocidadeMax = velocidadeMax;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public int getNumMaxPassageiros() {
        return numMaxPassageiros;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    abstract String getPlaneType();

    @Override
    public String toString() {
        return String.format("Identificador: %s; Fabricante: %s; Modelo: %s; Ano de produção: %2d; Número máximo de passageiros: %2d; Velocidade máxima: %2d;\n", this.identificador, this.fabricante, this.modelo, this.anoProducao, this.numMaxPassageiros, this.velocidadeMax);
    }

    

    
}
