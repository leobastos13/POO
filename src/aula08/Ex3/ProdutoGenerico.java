package aula08.Ex3;

public class ProdutoGenerico implements Produto {
    private String nome;
    private int qntStock;
    protected double preco;

    public ProdutoGenerico(String nome, int qntStock, double preco) {
        this.nome = nome;
        this.qntStock = qntStock;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.qntStock;
    }

    public void adicionarQuantidade(int quantidade) {
        this.qntStock += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.qntStock -= quantidade;
    }

    @Override
    public String toString() {
        return String.format("%s; Disponiveis: %d; Preco: %f;",
                this.nome,
                this.qntStock,
                this.preco);
    }
}
