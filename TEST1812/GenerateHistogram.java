package TEST1812;

public class GenerateHistogram {

    public static int[] generateHistogram(int[][] arr) {
        int maxValue = FindMaxValue.findMaxValue(arr);  //max hodnota
        int[] histogram = new int[maxValue + 1];  //pole pro histogram

        for (int[] row : arr) {
            for (int num : row) {
                histogram[num]++; 
            }
        }
        return histogram;
    }
}
