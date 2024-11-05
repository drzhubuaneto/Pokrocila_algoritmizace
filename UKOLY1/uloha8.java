package UKOLY1;

import java.util.Scanner;

public class uloha8 {
    //navíc z předchozí - vypíše nejvyšší teplotu u všech pac.
    //vpíše průměrnou tepovku pacientů, u kterých je splněna podmínka z předtim (teplota 36-37 a 55-85 bpm)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vzorky = 0;
        int vyhovujici = 0;
        double maxTeplota = 0;
        int sumaTepu = 0;
        int splnenePodminky = 0;

        System.out.println("zadej teploty ve stupních Celsia a tepové frekvence (v bpm) (konečná bude 0):");
        while (true) {
            double teplota = s.nextDouble();
            if (teplota == 0) break;
            int tep = s.nextInt();
            vzorky++;

            if (teplota > maxTeplota) {
                maxTeplota = teplota;
            }

            if (teplota > 36 && teplota < 37 && tep >= 55 && tep <= 85) { //podmínky
                vyhovujici++;
                sumaTepu += tep;
                splnenePodminky++;
            }
        }

        System.out.println("počet vzorků splňujících definované rozmezí je " + vyhovujici);
        if (vzorky > 0) {
            int procento = (vyhovujici * 100) / vzorky;
            System.out.println("procento pacientů splňujících definované rozmezí je " + procento + "%");
        }

        System.out.printf("nejvyšší teplota ve stupních Celsia je %.1f\n", maxTeplota);

        // Výpočet průměrné tepové frekvence
        if (splnenePodminky > 0) {
            double prumernaTepovaFrekvence = (double) sumaTepu / splnenePodminky;
            System.out.printf("průměrná tepovka v bpm je %.1f\n", prumernaTepovaFrekvence);
        }
        s.close();
    }
}
