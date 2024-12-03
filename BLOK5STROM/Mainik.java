package BLOK5STROM;

public class Mainik {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.addNode(10);
        tree.addNode(20);
        tree.addNode(5);
        tree.addNode(4);
        tree.addNode(6);

        System.out.println("AVL Tree:");
        tree.printTree();

        System.out.println("\nBalance Factors:");
        printBalanceFactors(tree.getRoot());
    }

    private static void printBalanceFactors(Node node) {
        if (node != null) {
            System.out.println("Node " + node.value + " - Balance Factor: " + node.calculateBalanceFactor());
            printBalanceFactors(node.left);
            printBalanceFactors(node.right);
        }
    }
}