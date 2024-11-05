package BLOK3;

public class floydmain {

    public static void main(String[] args) {
        int[][] matrix = VectorOperations.generateD(); //tvori cenovou matici

        System.out.println("pocatecni cenova matice:"); //tiskne matici
        VectorOperations.printMatrix(matrix);

        VectorOperations.floyd(matrix); //spusteni floyd algoritmu

        System.out.println("\nhotova matice vzdalenosti:"); //tiskne matici po upraveni floydem
        VectorOperations.printMatrix(matrix);
    }
}
