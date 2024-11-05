package BLOK3;
public class blok3a {
    public static void main(String args[]) {
    
        //int [][] matr1 = new int[][] {{1,2,3}, {4,5,6} , {7,8,9} , {8,3,2}};
        //VectorOperations.printmatrix(matr1);

        //int [][] matr2 = new int[][] {{1,6,3}, {4,5,2} , {7,1,9} , {3,3,2}};
        //VectorOperations.printmatrix(matr2);

        int [][] A = new int[][] {{1,2,3}, {4,5,6} , {7,8,9}};
        int [][] B = new int[][] {{1,6,3}, {4,5,2} , {7,1,9}};
        int[][] C = VectorOperations.nasobeni(A, B);
        VectorOperations.printmatrix(C);


    }
}
