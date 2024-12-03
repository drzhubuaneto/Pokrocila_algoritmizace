package miniprojekt;
import java.util.ArrayList;
import java.util.Scanner;

public class miniprojekt2a {
    public static void main(String[] args) {
        ArrayList<Integer> cisla = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int cislo;
        int nasobekpo0;

        System.out.println("zadej hodnoty cisel (zadej 0 pro ukonceni):");
        while (true) {
            System.out.print("zadej hodnotu cisla: ");
            cislo = sc.nextInt();
            if (cislo == 0) {
                System.out.print("zadej nasobek: ");
                nasobekpo0 = sc.nextInt();
                break;
            }
            if (cislo >= 1) {
                cisla.add(cislo);
            } else {
                System.out.println("neplatna hodnota");
            }
        }

        System.out.print("\nzadane cisla:");
        for (int i = 0; i < cisla.size(); i++) {
            int hodnota = cisla.get(i);
            System.out.printf(" %d,", hodnota);
            }

        System.out.print("\nnasobky cisel:");
        for (int i = 0; i < cisla.size(); i++) {
            int nasobek = cisla.get(i);
            System.out.printf(" %d,", nasobek*nasobekpo0);
            }
        
        sc.close();
    }
}
