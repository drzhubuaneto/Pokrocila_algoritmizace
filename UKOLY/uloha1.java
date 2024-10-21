package UKOLY;

import java.util.Scanner;
public class uloha1 {
    //sestavte algoritmus a program pro výpočet přepony pravoúhl. troj.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte délky obou odvěsen: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double prepona = Math.sqrt(a * a + b * b);
        System.out.printf("Délka přepony: %.4f\n", prepona);
        s.close();
    } 
}
