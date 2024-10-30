package BLOK2;

import java.util.Scanner;

public class ukol1forcykly {
    public static void main(String[] args) {
        main1(5);
    }

    public static void main1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main2(int num) {
        while (num >= 1) {
            System.out.print("#");
            num /= 2;
        }
         
    }

}
