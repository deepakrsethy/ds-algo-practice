package linkedlist.easy;

public class PrintCircularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head;

        printList(head, head);
    }

    private static void printList(Node curr, Node head) {
        if(head == null) {
            return;
        }

        System.out.print(curr.data+" ");

        if(curr.next == head) {
            return;
        }

        printList(curr.next, head);
    }
}
