package UKOLY;

import java.util.Scanner;

public class uloha7 {
    //vstup je sekvence těl. teplota pacientů (v celsiích na desetiny stupně) po 10 min. a jejich tepovka vklidu (bpm, na celé tepy), vstup končí 0
    //alg. vypíše kolik pac. mělo 36-37 st. a zároveň 55-85 bpm + vypíše kolik % z celk. počtu pac. to tvořilo (celý %)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vzorky = 0;
        int vyhovujici = 0;

        System.out.println("Zadejte teploty a tepové frekvence (konec 0):");
        while (true) {
            double teplota = s.nextDouble();
            if (teplota == 0) break;
            int tep = s.nextInt();
            vzorky++;
            if (teplota > 36 && teplota < 37 && tep >= 55 && tep <= 85) {
                vyhovujici++;
            }
        }

        System.out.println("Počet vzorků splňujících definované rozmezí: " + vyhovujici);
        if (vzorky > 0) {
            int procento = (vyhovujici * 100) / vzorky;
            System.out.println("Procento pacientů splňujících definované rozmezí: " + procento + "%");
        }
    }
}
