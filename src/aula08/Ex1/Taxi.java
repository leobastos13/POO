package aula08.Ex1;

public class Taxi extends AutomovelLigeiro {
    private int numLicenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacidade, int numLicenca) {
        super(matricula, marca, modelo, potencia, numQuadro, capacidade);
        this.numLicenca = numLicenca;
    }

    public int getNumLicenca() {
        return numLicenca;
    }

    @Override
    public String toString() {
        return String.format("%s; Número de Licença: %d;\n", super.toString(), this.numLicenca);
    }
}
