package BLOK4_LEPSI;

import java.util.*;

public class fce {

    //prohledávání do hloubky pro matici sousednosti
    public static void depthFirstSearchMatrix(int[][] adjacencyMatrix, int startNode) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(startNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (!visited.contains(currentNode)) {
                System.out.print(" discovered: " + (currentNode + 1));
                visited.add(currentNode);
            }

            //procházení sousedů uzlu (sloupce matice)
            for (int neighbor = 0; neighbor < adjacencyMatrix.length; neighbor++) {
                if (adjacencyMatrix[currentNode][neighbor] == 1 && !visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }
    }

    //prohledávání do šířky pro matici sousednosti
    public static void breadthFirstSearchMatrix(int[][] adjacencyMatrix, int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(" discovered: " + (currentNode + 1));

            //procházení sousedů uzlu (sloupce matice)
            for (int neighbor = 0; neighbor < adjacencyMatrix.length; neighbor++) {
                if (adjacencyMatrix[currentNode][neighbor] == 1 && !visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
