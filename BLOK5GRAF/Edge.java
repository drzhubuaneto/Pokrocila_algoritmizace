package BLOK5GRAF;

public class Edge {
    private int index;
    private Node nodeFrom;
    private Node nodeTo;

    public Edge(int index, Node nodeFrom, Node nodeTo) {
        this.index = index;
        this.nodeFrom = nodeFrom;
        this.nodeTo = nodeTo;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Node getNodeFrom() {
        return nodeFrom;
    }

    public void setNodeFrom(Node nodeFrom) {
        this.nodeFrom = nodeFrom;
    }

    public Node getNodeTo() {
        return nodeTo;
    }

    public void setNodeTo(Node nodeTo) {
        this.nodeTo = nodeTo;
    }
}
