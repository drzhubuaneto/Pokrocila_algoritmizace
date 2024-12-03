package BLOK5GRAF;

public class Main {
    public static void main(String[] args) {
        int[][] costMatrix = new int[][] {
            {0, 2, 0, 5},
            {0, 0, 0, 0},
            {0, 4, 0, 0},
            {0, 3, 1, 0}
        };

        Graph graph = new Graph(costMatrix);

        System.out.println("number of edges: " + graph.getEdges().size());
        System.out.println("number of nodes: " + graph.getNodes().size());
        Tools.printMatrix(graph.toAdjacencyMatrix());
    }
}