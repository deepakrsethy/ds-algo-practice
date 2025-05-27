package linkedlist.easy;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class PrintTheMiddleOfaGivenLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printMiddleOfList(head);

    }

    private static void printMiddleOfList(Node head) {
        int n = findSizeofList(head);
        int mid = n/2;

        int count = 0;
        while(head != null) {
            if(count == mid) {
                System.out.println("Middle element: "+ head.data);
                break;
            }
            count++;
            head = head.next;
        }
    }

    private static int findSizeofList(Node head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}
