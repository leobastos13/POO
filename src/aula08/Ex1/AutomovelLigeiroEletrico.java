package aula08.Ex1;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico {
    private int bateria;

    public AutomovelLigeiroEletrico(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacidade) {
        super(matricula, marca, modelo, potencia, numQuadro, capacidade);
        this.bateria = 100;
    }

    @Override
    public void trajeto(int quilometros) {
        
        if (quilometros >= 1000 && this.bateria >= 70) {
            this.bateria -= 70;

        } else if (quilometros < 1000 && this.bateria >= 45) {
            this.bateria -= 45;

        } else { 
            System.out.println("Sem bateria");
        }
        super.trajeto(quilometros);

        if (this.bateria < 0) {
            this.bateria = 0;
        }
    }

    public int autonomia() {
        return bateria;
    }

    public void carregar(int percentagem) {
        
        if (percentagem > 100 || percentagem <= 0 || percentagem < this.bateria) {
            System.out.println("Inválido");
            return;
        }
        this.bateria = percentagem;
    }

    @Override
    public String toString() {
        return String.format("%s; Bateria: %d;\n", super.toString(), this.bateria);
    }
}
