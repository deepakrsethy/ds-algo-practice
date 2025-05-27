package tree;

class Node {
    int data;
    Node left , right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class Tree {
    public static void main(String[] args) {
        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(5);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;

        inOrderDFS(firstNode);

        System.out.println();
        preOrderDFS(firstNode);

        System.out.println();
        postOrderDFS(firstNode);
    }

    //In order DFS : Left, Root, Right
    static void inOrderDFS(Node node) {
        if(node == null) return;
        inOrderDFS(node.left);
        System.out.print(node.data+" ");
        inOrderDFS(node.right);

    }
    // Pre-order DFS: Root, Left, Right
    static void preOrderDFS(Node node) {
        if(node == null) return;
        System.out.print(node.data+" ");
        preOrderDFS(node.left);
        preOrderDFS(node.right);
    }

    // Pre-order DFS: Left, Right, Root
    static void postOrderDFS(Node node) {
        if(node == null) return;
        preOrderDFS(node.left);
        preOrderDFS(node.right);
        System.out.print(node.data+" ");
    }
}
