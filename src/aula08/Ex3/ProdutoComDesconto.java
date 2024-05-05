package aula08.Ex3;

public class ProdutoComDesconto extends ProdutoGenerico {
    private double preco;
    private int desconto;

    public ProdutoComDesconto(String nome, int qntStock, double preco, int desconto) {
        super(nome, qntStock, preco);
        this.desconto = desconto;
    }

    public double precoComDesconto() {
        double precoComDesconto = ((100 - this.desconto) * this.preco) / 100;
        return precoComDesconto;
    }

    @Override
    public String toString() {
        return String.format("%s Preco com desconto: %f",
                super.toString(),
                precoComDesconto());
    }
}
