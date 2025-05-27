package linkedlist.easy;

public class ReverseALinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Before reversing");
        printTheList(head);

        Node reversed = reverseList(head);

        System.out.println("After reversing");
        printTheList(reversed);

    }

    private static Node reverseList(Node head) {
        //three pointers
        Node curr = head, prev = null, next = null;
        while (curr != null) {
            //store the next
            next = curr.next;
            //reverse
            curr.next = prev;

            //move the counter
            prev = curr;
            curr = next;
        }
        //return the reversed list head
        return prev;

    }

    public static void printTheList(Node head) {
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
