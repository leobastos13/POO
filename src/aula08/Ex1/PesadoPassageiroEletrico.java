package aula08.Ex1;

public class PesadoPassageiroEletrico extends PesadoPassageiro implements VeiculoEletrico {
    private int bateria;

    public PesadoPassageiroEletrico(String matricula, String marca, String modelo, double potencia, String numQuadro,
            double peso, int numMaxPassageiros) {
        super(matricula, marca, modelo, potencia, numQuadro, peso, numMaxPassageiros);
        this.bateria = 100;
    }

    @Override
    public void trajeto(int quilometros) {

        if (quilometros >= 1000 && this.bateria >= 80) {
            this.bateria -= 80;
        } else if (quilometros < 1000 && this.bateria >= 60) {
            this.bateria -= 60;
        } else {
            System.out.println("Carregue primeiro o automovel - Sem bateria.");
            return;
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
            System.out.println("Valor inválido.");
            return;
        }
        this.bateria = percentagem;
    }

    @Override
    public String toString() {
        return String.format("%s; Bateria: %d",
                super.toString(),
                this.bateria);
    }
}
