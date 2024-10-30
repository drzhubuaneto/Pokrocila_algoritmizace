package BLOK2;

import java.util.ArrayList;

public class ukol3tictoc {
    private static long startTime;
    public static void tic() {
        startTime = System.currentTimeMillis();
    }
    public static void toc() {
        System.out.println (System.currentTimeMillis() - startTime);
    }
    public static void main(String[] args) {
        int[] velikosti = {10000000};

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < velikosti[0]; i++) {
                list.add(1);
            }

            tic();
            list.remove(list.size() - 1);
            toc();

            tic();
            list.remove(0);
            toc();
       
    }
}
