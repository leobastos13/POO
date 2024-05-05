package aula06;

import aula05.DateYMD;

public class Professor extends Pessoa {
    private String categoria;
    private String departamento;

    public Professor(String nome, int cc, DateYMD dataNasc, String categoria, String departamento) {
        super(nome, cc, dataNasc);

        switch (categoria) {
            case "Auxiliar":
                this.categoria = categoria;
                break;
            
            case "Associado":
                this.categoria = categoria;
                break;
            
            case "Catedrático":
                this.categoria = categoria;
                break;

            default:
                System.out.println("Inválida");
                break;
        }
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getNome() {
        return this.getNome();
    }
    
}
