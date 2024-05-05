package Av1;

public class DVD extends LibraryItem {
    private int duracao;

    public DVD(String titulo, int d) {
        super(titulo);
        this.duracao = d;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + duracao;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        DVD other = (DVD) obj;
        if (duracao != other.duracao)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s, Duraçao: %d",
                super.toString(),
                this.duracao);
    }
}
