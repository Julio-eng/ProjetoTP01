package classe;

import java.util.Scanner;

public class Menu {

    Scanner ler = new Scanner(System.in);

    public int mes;
    public int ano;

    public double[][] jan;
    public double[][] fev;
    public double[][] mar;
    public double[][] abr;
    public double[][] mai;
    public double[][] jun;
    public double[][] jul;
    public double[][] ago;
    public double[][] set;
    public double[][] out;
    public double[][] nov;
    public double[][] dez;


    public void getMes() {
        System.out.println("----------------------------------");
        System.out.println("1-Janeiro    2-Fevereiro\n3-Marco      4-Abril\n5-Maio       6-Junho\n7-Julho      8-Agosto\n9-Setembro   10-Outubro\n11-Novembro  12-Dezembro");
        System.out.println("----------------------------------");
        System.out.println("Digite o numero referente ao mes desejado:");
        mes = ler.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Opcao invalida, tente novamente: ");
            mes = ler.nextInt();
        }
    }

    public void getAno() {
        System.out.println("Digite o ano desejado(valido apenas de 2011 a 2020):");
        ano = ler.nextInt();
        while (ano < 2011 || ano > 2020) {
            System.out.println("Opcao invalida, tente novamente: ");
            ano = ler.nextInt();
        }
    }


    public void getTemperatura(double[][] vetData) {

        System.out.println("Digite as temperaturas: ");

        if (ano == 2011) {
            for (int j = 0; j < vetData[0].length; j++) {
                vetData[0][j] = ler.nextDouble();
            }
        } else if (ano == 2012) {
            for (int j = 0; j < vetData[1].length; j++) {
                vetData[1][j] = ler.nextDouble();
            }
        } else if (ano == 2013) {
            for (int j = 0; j < vetData[2].length; j++) {
                vetData[2][j] = ler.nextDouble();
            }
        } else if (ano == 2014) {
            for (int j = 0; j < vetData[3].length; j++) {
                vetData[3][j] = ler.nextDouble();
            }
        } else if (ano == 2015) {
            for (int j = 0; j < vetData[4].length; j++) {
                vetData[4][j] = ler.nextDouble();
            }
        } else if (ano == 2016) {
            for (int j = 0; j < vetData[5].length; j++) {
                vetData[5][j] = ler.nextDouble();
            }
        } else if (ano == 2017) {
            for (int j = 0; j < vetData[6].length; j++) {
                vetData[6][j] = ler.nextDouble();
            }
        } else if (ano == 2018) {
            for (int j = 0; j < vetData[7].length; j++) {
                vetData[7][j] = ler.nextDouble();
            }
        } else if (ano == 2019) {
            for (int j = 0; j < vetData[8].length; j++) {
                vetData[8][j] = ler.nextDouble();
            }
        } else if (ano == 2020) {
            for (int j = 0; j < vetData[9].length; j++) {
                vetData[9][j] = ler.nextDouble();
            }
        }
    }

    public void entradaTemperatura() {

        if (mes == 1) {
            getTemperatura(jan);
        } else if (mes == 2) {
            getTemperatura(fev);
        } else if (mes == 3) {
            getTemperatura(mar);
        } else if (mes == 4) {
            getTemperatura(abr);
        } else if (mes == 5) {
            getTemperatura(mai);
        } else if (mes == 6) {
            getTemperatura(jun);
        } else if (mes == 7) {
            getTemperatura(jul);
        } else if (mes == 8) {
            getTemperatura(ago);
        } else if (mes == 9) {
            getTemperatura(set);
        } else if (mes == 10) {
            getTemperatura(out);
        } else if (mes == 11) {
            getTemperatura(nov);
        } else if (mes == 12) {
            getTemperatura(dez);
        }
    }

    public void getMedia(double[][] vetData) {
        double soma = 0;
        int i = 0;
        if (ano == 2011) {
            for (int j = 0; j < vetData[0].length; j++) {
                if (vetData[0][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[0].length; j++) {
                    soma += vetData[0][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2012) {
            for (int j = 0; j < vetData[1].length; j++) {
                if (vetData[1][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes não foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[1].length; j++) {
                    soma += vetData[1][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2013) {
            for (int j = 0; j < vetData[2].length; j++) {
                if (vetData[2][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[2].length; j++) {
                    soma += vetData[2][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2014) {
            for (int j = 0; j < vetData[3].length; j++) {
                if (vetData[3][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes não foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[3].length; j++) {
                    soma += vetData[3][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2015) {
            for (int j = 0; j < vetData[4].length; j++) {
                if (vetData[4][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[4].length; j++) {
                    soma += vetData[4][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2016) {
            for (int j = 0; j < vetData[5].length; j++) {
                if (vetData[5][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[5].length; j++) {
                    soma += vetData[5][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2017) {
            for (int j = 0; j < vetData[6].length; j++) {
                if (vetData[6][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[6].length; j++) {
                    soma += vetData[6][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2018) {
            for (int j = 0; j < vetData[7].length; j++) {
                if (vetData[7][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[7].length; j++) {
                    soma += vetData[7][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2019) {
            for (int j = 0; j < vetData[8].length; j++) {
                if (vetData[8][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[8].length; j++) {
                    soma += vetData[8][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        } else if (ano == 2020) {
            for (int j = 0; j < vetData[9].length; j++) {
                if (vetData[9][j] != 0) {
                    i++;
                }
            }
            if (i == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            } else {
                for (int j = 0; j < vetData[9].length; j++) {
                    soma += vetData[9][j];
                }
            }
            System.out.println("A media desse mes e: " + soma / vetData[0].length);
        }
    }

    public void calculoTemperaturaMedia() {

        if (mes == 1) {
            getMedia(jan);
        } else if (mes == 2) {
            getMedia(fev);
        } else if (mes == 3) {
            getMedia(mar);
        } else if (mes == 4) {
            getMedia(abr);
        } else if (mes == 5) {
            getMedia(mai);
        } else if (mes == 6) {
            getMedia(jun);
        } else if (mes == 7) {
            getMedia(jul);
        } else if (mes == 8) {
            getMedia(ago);
        } else if (mes == 9) {
            getMedia(set);
        } else if (mes == 10) {
            getMedia(out);
        } else if (mes == 11) {
            getMedia(nov);
        } else if (mes == 12) {
            getMedia(dez);
        }
    }

    public void getTemperaturaMinima(double[][] vetData) {
        int j = 0, k = 0;
        int dias;
        double tempMin = 0;

        if (ano == 2011) {

            for (int l = 0; l < vetData[0].length; l++) {
                if (vetData[0][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes não foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[0].length; i++) {
                if (vetData[0][j] <= vetData[0][i]) {
                    tempMin = vetData[0][j];
                } else {
                    tempMin = vetData[0][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[0].length; i++) {
                if (vetData[0][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2012) {

            for (int l = 0; l < vetData[1].length; l++) {
                if (vetData[1][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[1].length; i++) {
                if (vetData[1][j] <= vetData[1][i]) {
                    tempMin = vetData[1][j];
                } else {
                    tempMin = vetData[1][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[1].length; i++) {
                if (vetData[1][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2013) {

            for (int l = 0; l < vetData[2].length; l++) {
                if (vetData[2][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[2].length; i++) {
                if (vetData[2][j] <= vetData[2][i]) {
                    tempMin = vetData[2][j];
                } else {
                    tempMin = vetData[2][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[2].length; i++) {
                if (vetData[2][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2014) {

            for (int l = 0; l < vetData[3].length; l++) {
                if (vetData[3][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[3].length; i++) {
                if (vetData[3][j] <= vetData[3][i]) {
                    tempMin = vetData[3][j];
                } else {
                    tempMin = vetData[3][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[3].length; i++) {
                if (vetData[3][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2015) {

            for (int l = 0; l < vetData[4].length; l++) {
                if (vetData[4][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[4].length; i++) {
                if (vetData[4][j] <= vetData[4][i]) {
                    tempMin = vetData[4][j];
                } else {
                    tempMin = vetData[4][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[4].length; i++) {
                if (vetData[4][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2016) {

            for (int l = 0; l < vetData[5].length; l++) {
                if (vetData[5][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[5].length; i++) {
                if (vetData[5][j] <= vetData[5][i]) {
                    tempMin = vetData[5][j];
                } else {
                    tempMin = vetData[5][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[5].length; i++) {
                if (vetData[5][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2017) {

            for (int l = 0; l < vetData[6].length; l++) {
                if (vetData[6][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[6].length; i++) {
                if (vetData[6][j] <= vetData[6][i]) {
                    tempMin = vetData[6][j];
                } else {
                    tempMin = vetData[6][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[6].length; i++) {
                if (vetData[6][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2018) {

            for (int l = 0; l < vetData[7].length; l++) {
                if (vetData[7][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes não foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[7].length; i++) {
                if (vetData[7][j] <= vetData[7][i]) {
                    tempMin = vetData[7][j];
                } else {
                    tempMin = vetData[7][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[7].length; i++) {
                if (vetData[7][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2019) {

            for (int l = 0; l < vetData[8].length; l++) {
                if (vetData[8][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[8].length; i++) {
                if (vetData[8][j] <= vetData[8][i]) {
                    tempMin = vetData[8][j];
                } else {
                    tempMin = vetData[8][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[8].length; i++) {
                if (vetData[8][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2020) {

            for (int l = 0; l < vetData[9].length; l++) {
                if (vetData[9][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[9].length; i++) {
                if (vetData[9][j] <= vetData[9][i]) {
                    tempMin = vetData[9][j];
                } else {
                    tempMin = vetData[9][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura minima desse mes e: " + tempMin);
            System.out.println("A temperatura minima ocorreu nos dias:");
            for (int i = 0; i < vetData[9].length; i++) {
                if (vetData[9][i] == tempMin) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        }
    }

    public void calculoTemperaturaMinima() {

        if (mes == 1) {
            getTemperaturaMinima(jan);
        } else if (mes == 2) {
            getTemperaturaMinima(fev);
        } else if (mes == 3) {
            getTemperaturaMinima(mar);
        } else if (mes == 4) {
            getTemperaturaMinima(abr);
        } else if (mes == 5) {
            getTemperaturaMinima(mai);
        } else if (mes == 6) {
            getTemperaturaMinima(jun);
        } else if (mes == 7) {
            getTemperaturaMinima(jul);
        } else if (mes == 8) {
            getTemperaturaMinima(ago);
        } else if (mes == 9) {
            getTemperaturaMinima(set);
        } else if (mes == 10) {
            getTemperaturaMinima(out);
        } else if (mes == 11) {
            getTemperaturaMinima(nov);
        } else if (mes == 12) {
            getTemperaturaMinima(dez);
        }
    }

    public void getTemperaturaMaxima(double[][] vetData) {
        int j = 0, k = 0;
        int dias;
        double tempMax = 0;


        if (ano == 2011) {

            for (int l = 0; l < vetData[0].length; l++) {
                if (vetData[0][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[0].length; i++) {
                if (vetData[0][j] >= vetData[0][i]) {
                    tempMax = vetData[0][j];
                } else {
                    tempMax = vetData[0][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[0].length; i++) {
                if (vetData[0][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2012) {

            for (int l = 0; l < vetData[1].length; l++) {
                if (vetData[1][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[1].length; i++) {
                if (vetData[1][j] >= vetData[1][i]) {
                    tempMax = vetData[1][j];
                } else {
                    tempMax = vetData[1][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[1].length; i++) {
                if (vetData[1][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2013) {

            for (int l = 0; l < vetData[2].length; l++) {
                if (vetData[2][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[2].length; i++) {
                if (vetData[2][j] >= vetData[2][i]) {
                    tempMax = vetData[2][j];
                } else {
                    tempMax = vetData[2][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[2].length; i++) {
                if (vetData[2][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2014) {

            for (int l = 0; l < vetData[3].length; l++) {
                if (vetData[3][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[3].length; i++) {
                if (vetData[3][j] >= vetData[3][i]) {
                    tempMax = vetData[3][j];
                } else {
                    tempMax = vetData[3][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[3].length; i++) {
                if (vetData[3][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2015) {

            for (int l = 0; l < vetData[4].length; l++) {
                if (vetData[4][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[4].length; i++) {
                if (vetData[4][j] >= vetData[4][i]) {
                    tempMax = vetData[4][j];
                } else {
                    tempMax = vetData[4][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[4].length; i++) {
                if (vetData[4][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2016) {

            for (int l = 0; l < vetData[5].length; l++) {
                if (vetData[5][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[5].length; i++) {
                if (vetData[5][j] >= vetData[5][i]) {
                    tempMax = vetData[5][j];
                } else {
                    tempMax = vetData[5][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[5].length; i++) {
                if (vetData[5][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2017) {

            for (int l = 0; l < vetData[6].length; l++) {
                if (vetData[6][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[6].length; i++) {
                if (vetData[6][j] >= vetData[6][i]) {
                    tempMax = vetData[6][j];
                } else {
                    tempMax = vetData[6][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[6].length; i++) {
                if (vetData[6][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2018) {

            for (int l = 0; l < vetData[7].length; l++) {
                if (vetData[7][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int l = 0; l < vetData[7].length; l++) {
                if (vetData[7][j] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[7].length; i++) {
                if (vetData[7][j] >= vetData[7][i]) {
                    tempMax = vetData[7][j];
                } else {
                    tempMax = vetData[7][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[7].length; i++) {
                if (vetData[7][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2019) {

            for (int l = 0; l < vetData[8].length; l++) {
                if (vetData[8][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[8].length; i++) {
                if (vetData[8][j] >= vetData[8][i]) {
                    tempMax = vetData[8][j];
                } else {
                    tempMax = vetData[8][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[8].length; i++) {
                if (vetData[8][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        } else if (ano == 2020) {

            for (int l = 0; l < vetData[9].length; l++) {
                if (vetData[9][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int i = 0; i < vetData[9].length; i++) {
                if (vetData[9][j] >= vetData[9][i]) {
                    tempMax = vetData[9][j];
                } else {
                    tempMax = vetData[9][i];
                    j++;
                    i = 0;
                }
            }
            System.out.println("A temperatura maxima desse mes e: " + tempMax);
            System.out.println("A temperatura maxima ocorreu nos dias:");
            for (int i = 0; i < vetData[9].length; i++) {
                if (vetData[9][i] == tempMax) {
                    dias = i + 1;
                    System.out.println("" + dias + "/" + mes + "/" + ano);
                }
            }

        }

    }

    public void calculoTemperaturaMaxima() {

        if (mes == 1) {
            getTemperaturaMaxima(jan);
        } else if (mes == 2) {
            getTemperaturaMaxima(fev);
        } else if (mes == 3) {
            getTemperaturaMaxima(mar);
        } else if (mes == 4) {
            getTemperaturaMaxima(abr);
        } else if (mes == 5) {
            getTemperaturaMaxima(mai);
        } else if (mes == 6) {
            getTemperaturaMaxima(jun);
        } else if (mes == 7) {
            getTemperaturaMaxima(jul);
        } else if (mes == 8) {
            getTemperaturaMaxima(ago);
        } else if (mes == 9) {
            getTemperaturaMaxima(set);
        } else if (mes == 10) {
            getTemperaturaMaxima(out);
        } else if (mes == 11) {
            getTemperaturaMaxima(nov);
        } else if (mes == 12) {
            getTemperaturaMaxima(dez);
        }
    }

    public void printRelatorio(double[][] vetData) {
        int k = 0;
        System.out.println("Temperaturas deste ano e mes: ");

        if (ano == 2011) {

            for (int l = 0; l < vetData[0].length; l++) {
                if (vetData[0][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[0].length; j++) {
                System.out.println(vetData[0][j]);
            }
        } else if (ano == 2012) {

            for (int l = 0; l < vetData[1].length; l++) {
                if (vetData[1][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[1].length; j++) {
                System.out.println(vetData[1][j]);
            }
        } else if (ano == 2013) {

            for (int l = 0; l < vetData[2].length; l++) {
                if (vetData[2][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[2].length; j++) {
                System.out.println(vetData[2][j]);
            }
        } else if (ano == 2014) {

            for (int l = 0; l < vetData[3].length; l++) {
                if (vetData[3][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[3].length; j++) {
                System.out.println(vetData[3][j]);
            }
        } else if (ano == 2015) {

            for (int l = 0; l < vetData[4].length; l++) {
                if (vetData[4][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[4].length; j++) {
                System.out.println(vetData[4][j]);
            }
        } else if (ano == 2016) {

            for (int l = 0; l < vetData[5].length; l++) {
                if (vetData[5][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[5].length; j++) {
                System.out.println(vetData[5][j]);
            }
        } else if (ano == 2017) {

            for (int l = 0; l < vetData[6].length; l++) {
                if (vetData[6][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[6].length; j++) {
                System.out.println(vetData[6][j]);
            }
        } else if (ano == 2018) {

            for (int l = 0; l < vetData[7].length; l++) {
                if (vetData[7][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[7].length; j++) {
                System.out.println(vetData[7][j]);
            }
        } else if (ano == 2019) {

            for (int l = 0; l < vetData[8].length; l++) {
                if (vetData[8][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[8].length; j++) {
                System.out.println(vetData[8][j]);
            }
        } else if (ano == 2020) {

            for (int l = 0; l < vetData[9].length; l++) {
                if (vetData[9][l] != 0) {
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("As temperaturas deste mes nao foram coletadas");
                return;
            }

            for (int j = 0; j < vetData[9].length; j++) {
                System.out.println(vetData[9][j]);
            }
        }

        calculoTemperaturaMedia();
        calculoTemperaturaMinima();
        calculoTemperaturaMaxima();

    }

    public void relatorioMeteorologico() {
        if (mes == 1) {
            printRelatorio(jan);
        } else if (mes == 2) {
            printRelatorio(fev);
        } else if (mes == 3) {
            printRelatorio(mar);
        } else if (mes == 4) {
            printRelatorio(abr);
        } else if (mes == 5) {
            printRelatorio(mai);
        } else if (mes == 6) {
            printRelatorio(jun);
        } else if (mes == 7) {
            printRelatorio(jul);
        } else if (mes == 8) {
            printRelatorio(ago);
        } else if (mes == 9) {
            printRelatorio(set);
        } else if (mes == 10) {
            printRelatorio(out);
        } else if (mes == 11) {
            printRelatorio(nov);
        } else if (mes == 12) {
            printRelatorio(dez);
        }
    }

}


