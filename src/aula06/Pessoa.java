package aula06;


import aula05.DateYMD;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa( String nome, int cc, DateYMD dataNasc) {
        
        
        if (DateYMD.valid(dataNasc.getDay(), dataNasc.getMonth(), dataNasc.getYear())) {
            this.dataNasc = dataNasc;   
        } else {
            System.out.println("Opção Inválida");
        }

        if (valid(nome, cc)) {
            this.nome = nome;
            this.cc = cc;
        } else {
            System.out.println("Opção Inválida");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getCc() {
        return cc;
    }

    public DateYMD getDataNasc() {
        return dataNasc;
    }

    @Override
    public String toString() {
        return String.format("%s; cc:%08d; Data Nascimento:%s\n", this.nome, this.cc, this.dataNasc);
    }

    public boolean valid(String nome, int cc) {

        if (nome == "") {
           return false; 
        }

        if (cc <= 10000000 && cc >= 9999999) {
          return false;  
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + cc;
        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cc != other.cc)
            return false;
        if (dataNasc == null) {
            if (other.dataNasc != null)
                return false;
        } else if (!dataNasc.equals(other.dataNasc))
            return false;
        return true;
    }
    


}