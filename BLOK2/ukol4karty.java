package BLOK2;

import java.util.ArrayList;
import java.util.Scanner;

public class ukol4karty {
    public static void main(String[] args) {
        ArrayList<Integer> karty = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int karta;

        System.out.println("zadej hodnoty karet (1-14) (zadej 0 pro ukonceni):");
        while (true) {
            System.out.print("zadej hodnotu karty: ");
            karta = sc.nextInt();
            if (karta == 0) {
                break;
            }
            if (karta >= 1 && karta <= 14) {
                karty.add(karta);
            } else {
                System.out.println("neplatná hodnota");
            }
        }

        System.out.println("\nzadané karty:");
        for (int i = 0; i < karty.size(); i++) {
            int hodnota = karty.get(i);
            if (hodnota % 2 == 0) {
                System.out.println(hodnota + " suda hodnota!");
            } else {
                System.out.println(hodnota);
            }
        }
        sc.close();
    }
}
