package aula09.Ex3;

import java.util.Scanner;

public class PlaneTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlaneManager manager = new PlaneManager();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar avião");
            System.out.println("2 - Remover avião");
            System.out.println("3 - Procurar avião");
            System.out.println("4 - Imprimir informações de todos os aviões");
            System.out.println("5 - Imprimir lista de aviões comerciais");
            System.out.println("6 - Imprimir lista de aviões militares");
            System.out.println("7 - Imprimir informações do avião mais rápido");
            System.out.println("0 - Sair");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Escolha o tipo de avião:");
                    System.out.println("1 - Comercial");
                    System.out.println("2 - Militar");
                    int planeOption = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o ID do avião:");
                    String identificador = scanner.nextLine();

                    System.out.println("Digite o fabricante:");
                    String fabricante = scanner.nextLine();

                    System.out.println("Digite o modelo do avião:");
                    String modelo = scanner.nextLine();

                    System.out.println("Digite o ano de produção do avião:");
                    int anoProducao = scanner.nextInt();

                    System.out.println("Digite o número máximo de passageiros:");
                    int numMaxPassageiros = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.println("Digite a velocidade máxima do avião:");
                    int velocidadeMax = scanner.nextInt();
                    scanner.nextLine();


                    if (planeOption == 1) {
                        System.out.println("Digite o número de tripulantes do avião:");
                        int numTripulantes = scanner.nextInt();
                        scanner.nextLine();

                        manager.addPlane(new CommercialPlane(identificador, fabricante, modelo, anoProducao, numMaxPassageiros, velocidadeMax, numTripulantes));

                    } else if (planeOption == 2) {
                        System.out.println("Digite o número de munições:");
                        int numMunicoes = scanner.nextInt();

                        manager.addPlane(new MilitaryPlane(identificador, fabricante, modelo, anoProducao, numMaxPassageiros, velocidadeMax, numMunicoes));
                    }

                    System.out.println("Avião adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o ID do avião a ser removido:");
                    String remove = scanner.nextLine();

                    manager.removePlane(remove);

                    System.out.println("Avião removido com sucesso!");
                    break;

                case 3:
                    System.out.println("Digite o ID do avião a ser procurado:");
                    String search = scanner.nextLine();

                    Plane searchResult = manager.searchPlane(search);
                    if (searchResult == null) {
                        System.out.println("Avião não encontrado.");
                    } else {
                        System.out.println(searchResult.toString());
                    }
                    break;

                case 4:
                    manager.printAllPlanes();
                    break;

                case 5:
                    System.out.println("Lista de aviões comerciais:");
                    manager.getCommercialPlanes().forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Lista de aviões militares:");
                    manager.getMilitaryPlanes().forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Informações do avião mais rápido:");
                    System.out.println(manager.getFastestPlane().toString());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}