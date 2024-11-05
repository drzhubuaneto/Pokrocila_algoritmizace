package UKOLY1;

import java.util.Scanner;

public class uloha5 {
    //zadám a,b,c z kvad. rovninice - alg. určí reálné kořeny rovnice a pokud je nemá, řekne mi to
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("zadej koeficienty a, b, c: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double D = b*b - 4*a*c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2*a);
            double x2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.printf("x1 = %.2f, x2 = %.2f\n", x1, x2);
        } else if (D == 0) {
            double x = -b / (2*a);
            System.out.printf("x = %.2f\n", x);
        } else {
            System.out.println("rovnice nemá reálné kořeny");
        }
        s.close();
    }
}
