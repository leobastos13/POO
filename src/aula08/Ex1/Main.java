package aula08.Ex1;

public class Main {
    public static void main(String[] args) {
        AutomovelLigeiro ligeiro = new AutomovelLigeiro("AA-AA-00", "AAAA", "aaa00a", 222, "FG45DFF345CV56", 444);
        ligeiro.trajeto(1);
        ligeiro.trajeto(1111);
        ligeiro.trajeto(-22);
        System.out.println(ligeiro.ultimoTrajeto());
        System.out.println(ligeiro.distanciaTotal());

        PesadoPassageiroEletrico pEletrico = new PesadoPassageiroEletrico("PP-EE-99", "PEPE", "pepp", 712,
                "ASD23456789FGH", 876, 65);
        pEletrico.trajeto(6000);
        pEletrico.trajeto(444);
        pEletrico.carregar(100);
        pEletrico.trajeto(444);

        EmpresaAluguer empresa = new EmpresaAluguer("Carros Aluguer", "1111-111", "aluguer@carros.pt");
        empresa.adicionarAutomovel(ligeiro);
        empresa.adicionarAutomovel(new Motociclo("AA-AA-00", "AAAA", "aaa00a", 111, "estrada"));
        empresa.adicionarAutomovel(new Motociclo("AA-BB-00", "BBBB", "bb12bb", 111, "estrada"));
        empresa.adicionarAutomovel(new PesadoMercadoria("BB-PP-23", "BPBP", "bpbp23", 456, "SD345DF56FG", 999990, 600));
        empresa.adicionarAutomovel(new PesadoPassageiro("PP-PP-PP", null, null, 0, null, 0, 0));
        empresa.adicionarAutomovel(new PesadoPassageiro("PP-PP-PP", "BPBP", "bpbp23", 456, "SD345DF56FG", 9990, 50));
        empresa.adicionarAutomovel(new Taxi("00-TT-TT", "TTTT", "tttt", 123, "54GFD54CX54", 200, 654543));
        empresa.adicionarAutomovel(new AutomovelLigeiroEletrico("LL-EE-11", "LELE", "llll", 420, "SDFRTY67TY789", 654));
        empresa.adicionarAutomovel(pEletrico);
        System.out.println(empresa);
    }
}
