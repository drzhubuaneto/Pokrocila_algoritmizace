import java.util.ArrayList;
import java.util.Scanner;

public class miniprojekt2b {
    public static void main(String[] args) {
        ArrayList<Integer> sekvence = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int cislo;
        int soucet = 0;

        System.out.println("zadej hodnoty cisel (zadej 0 pro ukonceni):");
        while (true) {
            System.out.print("zadej hodnotu cisla: ");
            cislo = sc.nextInt();
            if (cislo == 0) {
                break;
            }
            if (cislo >= 1 && cislo <= 14) {
                sekvence.add(cislo);
                soucet += cislo;
            } else {
                System.out.println("neplatna hodnota");
            }
        }
        
        System.out.print("\nprumer:");
        double prumer = (double) soucet / sekvence.size();
        System.out.print(prumer);

        System.out.print("\nsekvence pozpatku:");
        for (int i = sekvence.size() - 1; i >=0; i--) {
            System.out.printf("%d, ", sekvence.get(i));
            }

        sc.close();

    }
}