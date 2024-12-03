package miniprojekt;
import java.util.Scanner;

public class miniprojekt1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vlozte pocet brigadniku: ");
        int pocetbrigadniku = sc.nextInt();

        int celkemoken = 0;
        int maxoken = 0;

        for (int i=1; i <=pocetbrigadniku; i++) {
            System.out.println("vlozte pocet oken kyere umyl birgadnik " + i + " ");
            int okna = sc.nextInt();
            celkemoken += okna;
            if (okna > maxoken) {
                maxoken = okna;
            }
            if (okna < 10) {
                System.out.println("malo vykonny brigadnik = vyradit!");
            }
        }
        sc.close();
        
        System.out.printf("dnes bylo umyto %d oken ", celkemoken);
        System.out.printf("a jeden brigadnik umyl max %d oken ", maxoken);
    }
}
