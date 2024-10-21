package UKOLY;

import java.util.Scanner;

public class uloha4 {
    //alg., co určí, zda zadaná 3 čísla mohou být stranami pravoúh. troj.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte délky tří stran: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        if (isRightTriangle(a, b, c)) {
            System.out.println("Trojúhelník je pravoúhlý.");
        } else {
            System.out.println("Trojúhelník není pravoúhlý.");
        }
    }

    public static boolean isRightTriangle(double x, double y, double z) {
        return (x * x + y * y == z * z) || (x * x + z * z == y * y) || (y * y + z * z == x * x);
    }
}
