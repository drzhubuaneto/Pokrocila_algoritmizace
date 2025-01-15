package ZKOUSKA;

public class mainiiiiiik {
    public static void main(String[] args) {
        int numVertices = 7; //pocet 
        bellmanford graph = new bellmanford(numVertices);
        graph.addEdge(0, 1, 2); //a-b je 2
        graph.addEdge(1, 2, 4); //b-c je 4
        graph.addEdge(1, 3, 5); //b-d je 5
        graph.addEdge(1, 5, 3); //b-f je 3
        graph.addEdge(1, 6, 20); //b-h je 20
        graph.addEdge(3, 4, 7); //d-e je 7
        graph.addEdge(4, 6, 1); //e-h je 1


        graph.execute(1);
    }
}