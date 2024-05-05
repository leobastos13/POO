package aula08.Ex1;

public class AutomovelLigeiro extends Viaturas {
    private String numQuadro;
    private double capacidade;

    public AutomovelLigeiro(String matricula, String marca, String modelo, double potencia, String numQuadro, int capacidade) {
        super(matricula, marca, modelo, potencia);
        this.numQuadro = numQuadro;
        this.capacidade = capacidade;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format("%s; Nº Quadro: %s; Capacidade Bagageira: %f",
                super.toString(),
                this.numQuadro,
                this.capacidade);
    }
}

