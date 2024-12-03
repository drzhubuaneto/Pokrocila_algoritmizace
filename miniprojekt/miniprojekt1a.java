package miniprojekt;
import java.util.Scanner;

public class miniprojekt1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vlozte pocet oken ktere umyl brigadnik 1: ");
        int okna1 = sc.nextInt();
        if (okna1 < 10) {
            System.out.println("malo vykonny brigadnik = vyradit!");
        }
        System.out.println("vlozte pocet oken ktere umyl brigadnik 2: ");
        int okna2 = sc.nextInt();
        if (okna2 < 10) {
            System.out.println("malo vykonny brigadnik = vyradit!");
        }        
        System.out.println("vlozte pocet oken ktere umyl brigadnik 3: ");
        int okna3 = sc.nextInt();
        if (okna3 < 10) {
            System.out.println("malo vykonny brigadnik = vyradit!");
        }
        int oknacelkem = okna1 + okna2 + okna3;
        System.out.printf("dnes bylo umyto %d oken a ", oknacelkem);
        sc.close();

        int maxokna;
        if (okna1 > okna2 && okna1 > okna3) {
            maxokna = okna1;
        } else if (okna2 > okna3) {
            maxokna = okna2;
        } else {
            maxokna = okna3;
        }
        System.out.printf("jeden brigadnik umyl max %d oken", maxokna);
    }
}