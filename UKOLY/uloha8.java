package UKOLY;

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

        System.out.println("Zadejte teploty a tepové frekvence (konec 0):");
        while (true) {
            double teplota = s.nextDouble();
            if (teplota == 0) break;
            int tep = s.nextInt();
            vzorky++;

            // Zjištění maximální teploty
            if (teplota > maxTeplota) {
                maxTeplota = teplota;
            }

            // Kontrola podmínek
            if (teplota > 36 && teplota < 37 && tep >= 55 && tep <= 85) {
                vyhovujici++;
                sumaTepu += tep;
                splnenePodminky++;
            }
        }

        System.out.println("Počet vzorků splňujících definované rozmezí: " + vyhovujici);
        if (vzorky > 0) {
            int procento = (vyhovujici * 100) / vzorky;
            System.out.println("Procento pacientů splňujících definované rozmezí: " + procento + "%");
        }

        // Výpis maximální teploty
        System.out.printf("Nejvyšší teplota: %.1f\n", maxTeplota);

        // Výpočet průměrné tepové frekvence
        if (splnenePodminky > 0) {
            double prumernaTepovaFrekvence = (double) sumaTepu / splnenePodminky;
            System.out.printf("Průměrná tepová frekvence: %.1f\n", prumernaTepovaFrekvence);
        }
    }
}
