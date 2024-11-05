package BLOK3;
public class VectorOperations {
    public static void printmatrix(int[][] matrix) {
        for (int i=0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print("" + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] nasobeni(int[][] A, int[][] B) {
        int sloupec = B[0].length;
        int radky = A.length;
        int[][] C = new int [radky][sloupec];

        for (int i=0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                for (int k=0; k < B.length; k++) {
                    C[i][j]=(A[i][k] * B[k][j]);
                }
            }
        }
        return C;
        }


    public static int[][] generateD() { //generuji cenovou matici grafu, metoda generateD
        int INF = Integer.MAX_VALUE; //znacim nekonecno
        return new int[][]{
            {0, 3, INF, 7}, //vyplnim na test konstantami
            {8, 0, 2, INF},
            {5, INF, 0, 1},
            {2, INF, INF, 0}
        };
    }

    public static void floydNextStep(int[][] matrix, int k) { //nasledujici krok algoritmu, metoda floydnextstep
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][k] != Integer.MAX_VALUE && matrix[k][j] != Integer.MAX_VALUE) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]); //pozor na preteceni
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) { //tisk matice na konzoli, metoda printmatrix
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE) {
                    System.out.print("INF ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void floyd(int[][] matrix) { //spusteni algoritmu
        int n = matrix.length;
        for (int k = 0; k < n; k++) {
            floydNextStep(matrix, k);
        }
    }
}
