package BLOK4;

import java.util.*;

public class vyhledavani {
    public static void depthFirstSearch(Map<Integer, List<Integer>> graph, int startNode) {
        Stack<Integer> stack = new Stack<>(); //zasobnik
        Set<Integer> visited = new HashSet<>();

        stack.push(startNode); //zacatek na startovnim uzlu

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (!visited.contains(currentNode)) { //pokud uzel nebyl navstiveny = navstivime a vypiseme
                System.out.print(" discovered: " + currentNode);
                visited.add(currentNode);
            }

            for (int neighbor : graph.getOrDefault(currentNode, new ArrayList<>())) { //vezmeme v potaz sousedy uzlu - pokud nebyl navstiven, navstivime a napiseme
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void breadthFirstSearch(Map<Integer, List<Integer>> graph, int startNode) {
        Queue<Integer> queue = new LinkedList<>(); //fronta
        Set<Integer> visited = new HashSet<>();

        queue.add(startNode); //pridame startovni uzel
        visited.add(startNode); //oznacime za navstiveny

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(" discovered: " + currentNode);

            for (int neighbor : graph.getOrDefault(currentNode, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void depthmatice(int[][] maticesousednosti, int start) {
        Stack<Integer> stack = new Stack<>(); //zasobnik
        LinkedList<Integer> visited = new LinkedList<>();

        stack.push(start); //zacatek na startovnim uzlu

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (!visited.contains(currentNode)) { //pokud uzel nebyl navstiveny = navstivime a vypiseme
                System.out.print(" discovered: " + currentNode);
                visited.add(currentNode);
            }

            for (int neighbor : maticesousednosti.getOrDefault(currentNode, new ArrayList<>())) { //tady udelam takovy to i, matice length a ze to projde sloupce a kde bude 1 to je soused
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                } //tady hodim if 1 tak to je ten soused
            }
        }
    }

    public static void breadthmatice(int[][] maticesousednosti, int start) {
        Queue<Integer> queue = new LinkedList<>(); //fronta
        Set<Integer> visited = new HashSet<>();

        queue.add(start); //pridame startovni uzel
        visited.add(start); //oznacime za navstiveny

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(" discovered: " + currentNode);

            for (int neighbor : maticesousednosti.getOrDefault(currentNode, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
