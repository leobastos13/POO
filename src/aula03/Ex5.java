package aula03;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int[] valor = leituraValores();
        impressaoResultados(calculoValorDia(valor), valor);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static int[] leituraValores() {

        System.out.print("Coloque o ano: ");
        int[] leitura = new int[3];
       leitura[0] = scanner.nextInt();
        
        do {
            System.out.print("Coloque o mês: ");
            leitura[1] = scanner.nextInt();
        } while (leitura[1] < 1 || leitura[1] > 12);

        do {
            System.out.print("Coloque o dia da semana: ");
            leitura[2] = scanner.nextInt();
        } while (leitura[2] < 1 || leitura[2] > 7);

        if (leitura[2] == 7) {
            leitura[2] = 0;
            return leitura;
        }
        return leitura;
    }

        public static int calculoValorDia(int[] dia) {

            if(dia[1] == 2) {

                if (dia[0] % 4 == 0 ) {
                    return 29;
                } else {
                    return 28;
                }

            } else {
                if (dia[1] <= 7){

                    if (dia[1] % 2 == 0) {
                        return 30;
                    } else {
                        return 31;
                    }

                } else {
                    if(dia[1] % 2 != 0) {
                        return 30;
                    }else {
                        return 30;
                    }
                }
            }

        }
    

        public static void impressaoResultados(int d, int[] a) {
            String[] calendario = new String[d+a[2]];
            String mes = "";

            switch (a[1]) {
                case 1:
                    mes = "Janeiro";
                    break;
                case 2:
                    mes = "Fevereiro";
                    break;    
                case 3:
                    mes = "Março";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                 case 5:
                    mes = "Maio";
                    break;
                case 6:
                    mes = "Junho";
                    break;
                case 7:
                    mes = "Julho";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Setembro";
                    break;
                 case 10:
                    mes = "Outubro";
                    break;
                case 11:
                    mes = "Novembro";
                    break;
                case 12:
                    mes = "Dezembro";
                    break;
            }
            System.out.printf("%12s %d\n",mes,a[0]);
            System.out.println(" Su Mo Tu We Th Fr Sa");

            for (int i = 0; i < a[2]; i++) {
                calendario[i] = "";    
            }

            int j = 1;
            for (int i = a[2]; i < d + a[2]; i++) {
                calendario[i] = Integer.toString(j++);
            }

            for (int i = d + a[2]; i < calendario.length; i++) {
                calendario[i] = " ";
            }

            for (int k = 0; k < calendario.length; k++) {
                System.out.printf("%3s",calendario[k]); 
                if((k+1)%7 == 0) System.out.println("");
            }
            System.out.println();
        }   
    }

