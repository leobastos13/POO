package aula06;

import aula05.DateYMD;

public class Bolseiro extends Aluno {
    private Professor orientador;
    private  int bolsa;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor orientador, int bolsa) {
        super(nome, cc, dataNasc, dataNasc);
        this.orientador = orientador;
        this.bolsa = bolsa;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return String.format("%s; cc:%08d; Data Nascimento:%s; Número Mecanográfico:%2d; Data Inscrição:%s; Orientador:%s; Bolsa:%2d\n", getNome(), getCc(), getDataNasc(), getNMec(), getDataInsc(), this.orientador, this.bolsa);
    }
}
