package day18;

public class Node {
    private int leftSon;
    private int rightSon;
    private  int node;
    public Node(int node){
        this.node=node;
            }

    public void setRightSon(int rightSon) {
        this.rightSon = rightSon;
    }

    public void setLeftSon(int leftSon) {
        this.leftSon = leftSon;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public int getNode() {
        return node;
    }

    public int getLeftSon() {
        return leftSon;
    }

    public int getRightSon() {
        return rightSon;
    }
}
