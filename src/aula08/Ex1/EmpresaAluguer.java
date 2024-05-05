package aula08.Ex1;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAluguer {
    private String nome;
    private String codigoPostal;
    private String email;
    private List<Viaturas> viaturas;


    public EmpresaAluguer(String nome, String codigoPostal, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.viaturas = new ArrayList<Viaturas>();
    }

    public void adicionarAutomovel(Viaturas automovelNovo) {
        if (automovelNovo.getMatricula() == null) {
            System.out.println("Veiculo inválido.");
            return;
        }
        if (viaturas.contains(automovelNovo)) {
            System.out.println("Veiculo existente.");
            return;
        }
        viaturas.add(automovelNovo);
    }

    @Override
    public String toString() {
        String automoveis = "";
        for (Viaturas automovel : this.viaturas) {
            automoveis += automovel.toString() + "\n";
        }
        return String.format("Empresa %s, Código postal: %s, E-mail: %s, Automóveis:\n %s",
                this.nome,
                this.codigoPostal,
                this.email,
                automoveis);
    }
}

