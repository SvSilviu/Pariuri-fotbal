package ro.mycode_tema;


import java.util.Scanner;

public class Functions {

    //todo functie ce primeste un vector de cote si returneaza o cota random

    public static double coteRandom(double[] cote) {
        int poz = (int) Math.floor(Math.random() * (cote.length));
        return cote[poz];
    }
    //todo functie ce genereaza  nr de goluri

    public static int numarGoluri() {
        return (int) Math.floor(Math.random() * 5);

    }

    //todo:functide de afisare echipe
    public static void afisare(String[] echipe) {
        for (int i = 0; i < echipe.length; i++) {
            System.out.println((i + 1) + " " + echipe[i] + " ");
        }
    }

    //todo generare meci


    public static void meci() {
        Scanner scanner = new Scanner(System.in);
        String[] echipe = {"Barcelona", "Real Madrid", "Manchester City", "PSG", "Bayern Munchen"};
        double[] cote = {2.4, 1.6, 1.9, 3.2, 2.5, 4.6};
        afisare(echipe);

        System.out.println("Introduceti  nuamrul echipei  1");
        int echipaUnu = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti  numarul  echipei 2");
        int echipaDoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduceti suma pariata");
        double suma = Double.parseDouble(scanner.nextLine());


        double cota1 = coteRandom(cote);
        double cota2 = coteRandom(cote);
        double cotaX = coteRandom(cote);

        String echipa1 = echipe[echipaUnu - 1];
        int nrGoluri1 = numarGoluri();
        String echipa2 = echipe[echipaDoi - 1];
        int nrGoluri2 = numarGoluri();


        System.out.println("Introduceti 1, 2 sau 0 (1->echipa1 2->echipa2 0->egal)");

        int alegere = Integer.parseInt(scanner.nextLine());

//        if (alegere == 1) {
//            System.out.println(echipa1 + " a inscris " + nrGoluri1 + " goluri !");
//            System.out.println(echipa2 + " a inscris " + nrGoluri2 + " goluri !");
//        }
//        if (alegere == 2) {
//            System.out.println(echipa2 + " a inscris " + nrGoluri2 + " goluri !");
//            System.out.println(echipa1 + " a inscris " + nrGoluri1 + " goluri !");
//        }
//        if (nrGoluri1 == nrGoluri2) {
//            System.out.println("Meciul s-a terminat la egaliate " + nrGoluri1 + " - " + nrGoluri2);
//        } else if (nrGoluri1 > nrGoluri2) {
//            System.out.println(echipa1 + " a castigat meciul cu scorul de " + nrGoluri1 + " - " + nrGoluri2);
//        } else if (nrGoluri1 < nrGoluri2) {
//            System.out.println(echipa2 + " a castigat meciul cu scorul de " + nrGoluri2 + " - " + nrGoluri1);
//        }
//


        System.out.println(echipa1 + " vs " + echipa2);
        System.out.println(nrGoluri1 + " : " + nrGoluri2);

        double castig = 0.0;

        if (alegere == 0 && nrGoluri1 == nrGoluri2) {
            castig = suma * (cotaX * 10);
            System.out.println("Felicitari ati castigat suma de " + castig + " lei");
        } else if (alegere == 2 && nrGoluri1 < nrGoluri2) {
            castig = suma * (cota2 * 10);
            System.out.println("Felicitari ati castigat suma de " + castig + " lei");
        } else if (alegere == 1 && nrGoluri1 > nrGoluri2) {
            castig = suma * (cota1 * 10);
            System.out.println("Felicitari ati castigat suma de " + castig + " lei");
        } else {
            System.out.println("A-ti pierdut");
        }
    }
}

