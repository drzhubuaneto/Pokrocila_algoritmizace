package TEST1812;

import java.util.Random;

public class generaterandommatrix {
    public static int[][] generateRandomMatrix(int dim1, int dim2, int maxValue) {
        Random random = new Random();
        int[][] matrix = new int[dim1][dim2];

        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                matrix[i][j] = random.nextInt(maxValue + 1); 
            }
        }
        return matrix;
    }
}
