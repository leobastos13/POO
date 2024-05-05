package aula09.Ex3;

public class MilitaryPlane extends Plane {
    private int numMunicoes;

    public MilitaryPlane(String identificador, String fabricante, String modelo, int anoProducao, int numMaxPassageiros,int velocidadeMax, int numMunicoes) {
        super(identificador, fabricante, modelo, anoProducao, numMaxPassageiros, velocidadeMax);
        this.numMunicoes = numMunicoes;
    }

    public int getNumMunicoes() {
        return numMunicoes;
    }

    @Override
    public String getPlaneType() {
        return "Militar";
    }

    @Override
    public String toString() {
        return String.format("%s; Número de munições: %d\n", super.toString(), this.numMunicoes);
    }

    
}
