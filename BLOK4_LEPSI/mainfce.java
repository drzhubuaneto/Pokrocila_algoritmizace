package BLOK4_LEPSI;

public class mainfce {
    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
            {0, 1, 1, 0, 0, 0, 0},
            {1, 0, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0}
    };

        System.out.println("DFS:");
        fce.depthFirstSearchMatrix(adjacencyMatrix, 0);

        System.out.println("\nBFS:");
        fce.breadthFirstSearchMatrix(adjacencyMatrix, 0); 
    }
}

    