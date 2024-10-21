package UKOLY;

import java.util.Scanner;

public class uloha6 {
    //vstup je sekvence kladných čísel zakončená 0, alg. určí kolik čísel mezi nimi je lichých a zároveň dělitelných 3
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.println("zadej sekvenci čísel (konečná bude 0):");
        while (true) {
            int n = s.nextInt();
            if (n == 0) break;
            if (n % 2 != 0 && n % 3 == 0) {
                count++;
            }
        }

        System.out.println("počet lichých čísel dělitelných 3 je " + count);
        s.close();
    }
}
