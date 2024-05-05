package aula06;

import aula05.DateYMD;
import java.util.Scanner;

class Contacto {
    private Pessoa pessoa;
    private int contactoID;
    private static int contactoIDAtual = 0;
    private String email;
    private String telemovel;

    public Contacto(Pessoa pessoa, int contactoID, String email, String telemovel) {
        
        if (valid(email, telemovel)) {
           this.email = email;
           this.telemovel = telemovel; 

        } else {
            System.out.println("Contactos inválidos");
        }
        this.contactoID = contactoIDAtual;
        contactoIDAtual++;
    }

    public int getContactoID() {
        return contactoID;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public boolean valid( String email, String telemovel) {

        if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            return true;
        }

        if (telemovel.matches("9\\d{8}")) {
            return true;
        }
        return false;
    }

    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateYMD dataNasc;
        Pessoa pessoa;
        Contacto[] contactos = new Contacto[5];
        int escolha;

        do {
            System.out.println("1 - Inserir contacto  ");
            System.out.println("2 - Alterar contacto ");
            System.out.println("3 - Apagar contacto ");
            System.out.println("4 - Procurar contacto ");
            System.out.println("5 - Listar contactos ");
            System.out.println("0 - Sair ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Insere o nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Insere o cc: ");
                    int cc = scanner.nextInt();

                    System.out.println("Insere a data nascimento: ");

                    System.out.print("Insere o dia: ");
                    int dia = scanner.nextInt();
    
                    System.out.print("Insere o mês: ");
                    int mes = scanner.nextInt();
    
                    System.out.print("Insere o ano: ");
                    int ano = scanner.nextInt();
    
                    dataNasc = new DateYMD(dia, mes, ano);
                    pessoa = new Pessoa(nome, cc, dataNasc);

                    if (existe(pessoa.getNome())) {
                        System.out.println("O contacto já existe;\n Pretende continuar? ");
                        String resposta = scanner.nextLine();

                        if (resposta.equalsIgnoreCase("Não")) {
                            break;
                        }  
                    }
                    
                    System.out.println("Insere o email:");
                    String email = scanner.nextLine();

                    System.out.println("Insere o número de telémovel: ");
                    String telemovel = scanner.nextLine();

                    contactos[contactoIDAtual] = new Contacto(pessoa, contactoIDAtual, email, telemovel);
                    contactoIDAtual++;
                    
                    break;

                case 2:
                    System.out.println("Insere o nome ou o número de telemóvel: ");
                    String resposta = scanner.nextLine();
                    int index = 0;
                    boolean found = false;
                    for (int i = 0; i < contactos.length; i++) {

                        if (resposta == contactos[i].getTelemovel() || resposta == contactos[i].getPessoa().getNome()) {
                            index = i;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contacto não encontrado");
                        break;
                    }

                    System.out.println(contactos[index].getPessoa().getNome() + " - " + contactos[index].getContactoID() + " - " + contactos[index].getEmail() + " - " + contactos[index].getTelemovel());
                    
                    System.out.println("Pretende alterar o contacto: ");
                    resposta = scanner.nextLine();

                    if (resposta.equalsIgnoreCase("Não")) {
                        break;
                    }

                    System.out.println("Insere o novo número de telemóvel: ");
                    String novoTelemovel = scanner.nextLine();
                    
                    System.out.println("Insere o novo email: ");
                    String novoEmail = scanner.nextLine();

                    contactos[index] = new Contacto(contactos[index].getPessoa(), index, novoEmail, novoTelemovel);

                case 3:
                    System.out.println("Insere o nome ou o número de telemóvel: ");
                    resposta = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < contactos.length; i++) {

                        if (resposta == contactos[i].getTelemovel() || resposta == contactos[i].getPessoa().getNome()) {
                            index = i;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contacto não encontrado");
                        break;
                    }
                    
                    System.out.println("Contacto eliminado ");

                case 4:
                    System.out.println("Insere o nome ou o número de telemóvel: ");
                    resposta = scanner.nextLine();
                    found = false;
                    index = 0;
                    for (int i = 0; i < contactos.length; i++) {

                        if (resposta == contactos[i].getTelemovel() || resposta == contactos[i].getPessoa().getNome()) {
                            index = i;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contacto não encontrado");
                        break;
                    }

                    System.out.println(contactos[index].getPessoa() + " - " + contactos[index].getContactoID() + " - " + contactos[index].getEmail() + " - " + contactos[index].getTelemovel());

                case 5:
                    System.out.println(" Lista de contactos: ");

                    for (int i = 0; i <= contactoIDAtual ; i++) {
                        System.out.println(contactos[i].getPessoa() + " - " + contactos[i].getContactoID() + " - " + contactos[i].getEmail() + " - " + contactos[i].getTelemovel());
                    }

                    default:
                        break;
            }
        } while (escolha != 0 );

        scanner.close();
    }

    public static boolean existe(String nome) {
        return false;
    }
}
