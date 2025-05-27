package linkedlist;

class DoubleNode {
    int data;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DoubleNode head = new DoubleNode(1);
        DoubleNode second = new DoubleNode(10);
        DoubleNode third = new DoubleNode(111);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        forwardTraverseDoublyLinkedList(head);

        backwardTraverseDoublyLinkedList(third);

        findLengthOfDoublyLinkedList(head);

    }

    private static void findLengthOfDoublyLinkedList(DoubleNode head) {
        int length = 0;
        DoubleNode curr = head;
        while(curr != null) {
            length++;
            curr = curr.next;
        }
        System.out.println("Length of Doubly LinkedList: "+length);
    }

    private static void backwardTraverseDoublyLinkedList(DoubleNode tail) {
        DoubleNode curr = tail;
        while(curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.prev;
        }
        System.out.println();
    }

    private static void forwardTraverseDoublyLinkedList(DoubleNode head) {
        DoubleNode curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
