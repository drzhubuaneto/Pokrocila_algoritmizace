package TEST1812;

public class FindMaxValue {

    public static int findMaxValue(int [][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
}
