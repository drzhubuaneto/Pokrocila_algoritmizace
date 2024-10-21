package UKOLY;

import java.util.Scanner;

public class uloha2 {
    //sestavte algoritmus, co převede zadanou rychlost v m/s na mi/h, na 2 des. místa
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte rychlost v m/s: ");
        double rychlost = s.nextDouble();
        double rychlostMih = rychlost * 3600 / 1609.35;
        System.out.printf("Rychlost v mi/h: %.2f\n", rychlostMih);
    }
}
