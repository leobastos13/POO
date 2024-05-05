package aula06;

import java.time.LocalDate;

import aula05.DateYMD;

public class Aluno extends Pessoa {
    private int NMec;
    private DateYMD dataInsc;
    private static int currentNMec = 100;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc) {
        super(nome, cc, dataNasc);

        if (dataInsc == null) {

            LocalDate data = LocalDate.now();
            DateYMD dataAtual = new DateYMD(data.getDayOfMonth(), data.getMonthValue(), data.getYear());
            this.dataInsc = dataAtual;

        } else {
           this.dataInsc = dataInsc; 
        }
        this.NMec = currentNMec;
        Aluno.currentNMec++;
        

    }

    public Aluno(String nome, int cc, DateYMD dataNasc) {
        this(nome, cc, dataNasc, null);
    }

    public int getNMec() {
        return NMec;
    }

    public DateYMD getDataInsc() {
        return dataInsc;
    }

    public static void setCurrentNMec(int currentNMec) {
        Aluno.currentNMec = currentNMec;
    }

    public void setDataInsc(DateYMD dataInsc) {
        this.dataInsc = dataInsc;
    }

    public String toString() {
        return String.format("nome: %s; cc: %08d; Data Nascimento: %s; Número Mecanográfico: %2d; Data Inscrição: %s\n", getNome(), getCc(), getDataNasc(), this.NMec, this.dataInsc);
    }
    
}
