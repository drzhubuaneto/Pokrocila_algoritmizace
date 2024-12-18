package TEST1812;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 1},
                {2, 1, 2, 5},
                {1, 2, 3, 4},
                {7, 7, 1, 0}
        };

        int max = FindMaxValue.findMaxValue(arr);
        System.out.println("max hodnota: " + max);

        int[] histogram = GenerateHistogram.generateHistogram(arr);
        System.out.println("histogram: " + Arrays.toString(histogram));
    }
}
