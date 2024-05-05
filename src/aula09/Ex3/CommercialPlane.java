package aula09.Ex3;

public class CommercialPlane extends Plane {
    private int numTripulantes;

    public CommercialPlane(String identificador, String fabricante, String modelo, int anoProducao, int numMaxPassageiros, int velocidadeMax, int numTripulantes) {
        super(identificador, fabricante, modelo, anoProducao, numMaxPassageiros, velocidadeMax);
        this.numTripulantes = numTripulantes;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    @Override
    public String getPlaneType() {
        return "Comercial";
    }

    @Override
    public String toString() {
        return String.format("%s; Número de tripulantes: %d\n", super.toString(), this.numTripulantes);
    }

    

}
