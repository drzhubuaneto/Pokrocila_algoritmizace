package BLOK2;

import java.util.Scanner;

public class ukol5vyhledavanipole {
    public static boolean sekvencniVyhledavani(int[] pole, int hledanyPrvek) {
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] == hledanyPrvek) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pole = {1, 3, 5, 7, 9, 11, 13, 15, 17};

        System.out.print("zadej cislo, ktere chces vyhledat v poli - ");
        int hledanyPrvek = scanner.nextInt();

        boolean nalezeno = sekvencniVyhledavani(pole, hledanyPrvek);

        if (nalezeno) {
            System.out.println("prvek " + hledanyPrvek + " byl nalezen v poli");
        } else {
            System.out.println("prvek " + hledanyPrvek + " nebyl nalezen v poli");
        }

        scanner.close();
    }
}
