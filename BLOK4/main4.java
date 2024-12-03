package BLOK4;

import java.util.*;

public class main4 {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>(); //graf jako seznam sousedu
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(2, 5));

        System.out.println(" prohledavani grafu do hloubky z uzlu 0:");
        vyhledavani.depthFirstSearch(graph, 0);


        System.out.println(" prohledavani grafu do sirky z uzlu 0:");
        vyhledavani.breadthFirstSearch(graph, 0);
    }
}
