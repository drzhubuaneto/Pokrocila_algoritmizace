package BLOK2;

import java.util.ArrayList;

public class ukol2pole {
    public static void main(String[] args) {
        System.out.println("vypiste hodnoty prvni karty od 1 do 14: ");
    }

    public static void polefceofiko(int num) {
        Scanner sc = new Scanner(System.in);
        int[] karty = new int[5]; //deklarace statickeho pole
        for(int i = 0; i < karty.length; i++) {
            karty[i] = sc.nextInt(); 
        }

        for (int i = 0; i < karty.length; i++) {
            int hodnota = 0;
            do {
                System.out.print("zadej hodnotu karty " + (i + 1) + " (1-14): ");
                hodnota = sc.nextInt();
                if (hodnota < 1 || hodnota > 14) {
                    System.out.println("Neplatná hodnota, zadejte číslo mezi 1 a 14.");
                }
            } while (hodnota < 1 || hodnota > 14);
            karty[i] = hodnota;
        }

        int soucet = 0;
        int nejvyssiKarta = karty[0];
        for(int i = 0; i < karty.length; i++) {
            soucet += karty[i];
            if (karty[i] > nejvyssiKarta) {
                nejvyssiKarta = karty[i];
            }
        }

    System.out.println("Součet hodnot karet: " + soucet);
    System.out.println("Nejvyšší hodnota karty: " + nejvyssiKarta);
    }
}