package BLOK5STROM;

public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void addNode(int value) {
        root = addNodeRecursive(root, value);
    }

    private Node addNodeRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addNodeRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addNodeRecursive(current.right, value);
        }

        return balanceNode(current);
    }

    private Node balanceNode(Node node) {
        int balanceFactor = node.calculateBalanceFactor();

        if (balanceFactor > 1) {
            if (node.left.calculateBalanceFactor() < 0) {
                node.left = rotateLeft(node.left);
            }
            return rotateRight(node);
        }

        if (balanceFactor < -1) {
            if (node.right.calculateBalanceFactor() > 0) {
                node.right = rotateRight(node.right);
            }
            return rotateLeft(node);
        }

        return node;
    }

    private Node rotateLeft(Node node) {
        Node newRoot = node.right;
        node.right = newRoot.left;
        newRoot.left = node;
        return newRoot;
    }

    private Node rotateRight(Node node) {
        Node newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;
        return newRoot;
    }

    public void printTree() {
        printTreeRecursive(root, "", true);
    }

    private void printTreeRecursive(Node current, String indent, boolean isRight) {
        if (current != null) {
            System.out.println(indent + (isRight ? "R---- " : "L---- ") + current.value);
            printTreeRecursive(current.left, indent + "     ", false);
            printTreeRecursive(current.right, indent + "     ", true);
        }
    }
}
