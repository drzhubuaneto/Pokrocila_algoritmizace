package BLOK5STROM;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int calculateLeftHeight() {
        if (left == null) {
            return 0;
        }
        return 1 + Math.max(left.calculateLeftHeight(), left.calculateRightHeight());
    }

    public int calculateRightHeight() {
        if (right == null) {
            return 0;
        }
        return 1 + Math.max(right.calculateLeftHeight(), right.calculateRightHeight());
    }

    public int calculateBalanceFactor() {
        int leftHeight = calculateLeftHeight();
        int rightHeight = calculateRightHeight();
        return leftHeight - rightHeight;
    }
}
