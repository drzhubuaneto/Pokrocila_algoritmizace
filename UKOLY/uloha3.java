package UKOLY;

import java.util.Scanner;

public class uloha3 {
    //rufferova zkouška - vložim tepovky a spočítá mi to index + vypíše mojí klasifikaci
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Zadejte TF1 (tepovka před zátěží), TF2 (tepovka ihned po zátěži) a TF3 (tepovka 1 minutu po zátěži): ");
        int TF1 = s.nextInt();
        int TF2 = s.nextInt();
        int TF3 = s.nextInt();
        double RI = (TF1 + TF2 + TF3 - 200) / 10.0;
        System.out.printf("Ruffierův index: %.1f\n", RI);
        
        String zdatnost;
        if (RI < 0) {
            zdatnost = "Výborná";
        } else if (RI <= 5) {
            zdatnost = "Velmi dobrá";
        } else if (RI <= 10) {
            zdatnost = "Průměrná";
        } else if (RI <= 15) {
            zdatnost = "Podprůměrná";
        } else {
            zdatnost = "Nedostatečná";
        }
        System.out.println("Zdatnost: " + zdatnost);
    }
}
