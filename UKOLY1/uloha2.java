package UKOLY1;

import java.util.Scanner;

public class uloha2 {
    //sestavte algoritmus, co převede zadanou rychlost v m/s na mi/h, na 2 des. místa
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("zadej rychlost v m/s: ");
        double rychlost = s.nextDouble();
        double rychlostMih = rychlost * 3600 / 1609.35;
        System.out.printf("rychlost v mi/h je %.2f\n", rychlostMih);
        s.close();
    }
}
