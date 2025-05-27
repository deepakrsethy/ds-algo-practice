package linkedlist.easy;

import static linkedlist.easy.ReverseALinkedList.printTheList;

public class RotateALinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Before reversing");
        printTheList(head);

        System.out.println("After reversing");
        printTheList(rightRotate(head));
    }

    private static Node rightRotate(Node head) {
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        curr = curr.next;
        head = head.next;
        curr.next = null;
        return head;
    }
}
