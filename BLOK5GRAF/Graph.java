package BLOK5GRAF;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> nodes;
    private List<Edge> edges;

    public Graph(int[][] costMatrix) {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        
        for (int i = 0; i < costMatrix.length; i++) {
            nodes.add(new Node(i));
        }

        int edgeIndex = 0;
        for (int i = 0; i < costMatrix.length; i++) {
            for (int j = 0; j < costMatrix[i].length; j++) {
                if (costMatrix[i][j] > 0) { 
                    edges.add(new Edge(edgeIndex++, nodes.get(i), nodes.get(j)));
                }
            }
        }
    }

    public int[][] toAdjacencyMatrix() {
        int size = nodes.size();
        int[][] adjacencyMatrix = new int[size][size];

        for (Edge edge : edges) {
            int fromIndex = edge.getNodeFrom().getIndex();
            int toIndex = edge.getNodeTo().getIndex();
            adjacencyMatrix[fromIndex][toIndex] = 1; 
        }

        return adjacencyMatrix;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
