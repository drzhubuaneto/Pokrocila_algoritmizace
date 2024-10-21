package UKOLY;

import java.util.Scanner;

public class uloha4 {
    //alg., co určí, zda zadaná 3 čísla mohou být stranami pravoúh. troj.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("zadej délky tří stran trojúhelníku v cm: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        if (isRightTriangle(a, b, c)) {
            System.out.println("trojúhelník je pravoúhlý");
        } else {
            System.out.println("trojúhelník není pravoúhlý");
        s.close();
        }
    }

    public static boolean isRightTriangle(double x, double y, double z) {
        return (x * x + y * y == z * z) || (x * x + z * z == y * y) || (y * y + z * z == x * x);
    }
}
