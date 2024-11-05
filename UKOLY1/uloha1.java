package UKOLY1;

import java.util.Scanner;
public class uloha1 {
    //sestavit algoritmus a program pro výpočet přepony pravoúhl. trojúhelníku
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("zadej délky obou odvěsen v cm: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double prepona = Math.sqrt(a*a + b*b);
        System.out.printf("délka přepony v cm je %.4f\n", prepona);
        s.close();
    } 
}
