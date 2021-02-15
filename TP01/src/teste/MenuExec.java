package teste;


import classe.Menu;

import java.util.Scanner;

public class MenuExec {
    public static void main(String[] args) {
        Menu datas = new Menu();

        datas.jan = new double[10][31];
        datas.jan[9] = new double[] {40, 31, 27, 54, 32, 12, 16, 12, 54, 43, 11, 13, 24, 1, -5, -16, -9, 5, 27, 25, 35, -20, 34, 31, 21, 24, 29, 28, 30, -8, 31};
        datas.fev = new double[10][];
        for (int i = 0; i < 10; i++) {
            if (i == 1 || i == 5 || i == 9) {
                datas.fev[i] = new double[29];
            } else {
                datas.fev[i] = new double[28];
            }
        }
        datas.mar = new double[10][31];
        datas.abr = new double[10][30];
        datas.mai = new double[10][31];
        datas.jun = new double[10][30];
        datas.jul = new double[10][31];
        datas.ago = new double[10][31];
        datas.set = new double[10][30];
        datas.out = new double[10][31];
        datas.nov = new double[10][30];
        datas.dez = new double[10][31];


        int aux = 0;
        int escolha;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("----------------------------------");
            System.out.println("1. Entrada das temperaturas\n2. Cálculo da temperatura média\n3. Cálculo da temperatura mínima\n4. Cálculo da temperatura máxima\n5. Relatório meteorológico\n6. Exit");
            System.out.println("----------------------------------");
            System.out.println("Escolha uma das opções acima:");
            escolha = ler.nextInt();

            while (escolha < 1 || escolha > 6) {
                System.out.println("Opção inválida, tente novamente: ");
                escolha = ler.nextInt();
            }

            switch (escolha) {
                case 1:
                    datas.getMes();
                    datas.getAno();
                    datas.entradaTemperatura();
                    break;
                case 2:
                    datas.getMes();
                    datas.getAno();
                    datas.calculoTemperaturaMedia();
                    break;
                case 3:
                    datas.getMes();
                    datas.getAno();
                    datas.calculoTemperaturaMinima();
                    break;
                case 4:
                    datas.getMes();
                    datas.getAno();
                    datas.calculoTemperaturaMaxima();
                    break;
                case 5:
                    datas.getMes();
                    datas.getAno();
                    datas.relatorioMeteorologico();
                    break;
                case 6:
                    if (escolha == 6) {
                        aux = 6;
                    }
                    break;
            }

        } while (aux != 6);
        ler.close();
    }
}