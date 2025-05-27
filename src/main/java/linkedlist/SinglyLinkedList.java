package linkedlist;
class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(12);
        head.next.next = new Node(33);
        head.next.next.next = new Node(94);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(16);

       /* printLinkedList(head);
        System.out.println();
        findLengthOfLinkedList(head);
        System.out.println();
        Node newNode = new Node(11);
        printLinkedList(insertAtFront(head, newNode));
        System.out.println();
        Node newNode2 = new Node(31);
        printLinkedList(insertAtEnd(head, newNode2));

        Node newNode4 = new Node(41);
        printLinkedList(insertAfterAGivenNode(head, newNode4, 2));

        Node newNode3 = new Node(41);
        printLinkedList(insertBeforeAGivenNode(head, newNode3, 2));


        Node newNode5 = new Node(51);
        printLinkedList(insertAtASpecificPosition(head, newNode5, 3));
        searchLinkedList(head, 4);
        deleteAGivenKey(head, 4);

        deleteANodeAtAGivenPosition(head, 2);
        deleteALinkedList(head);

        getNthNodeFromLinkedList(head, 3);
        */

        getNthNodeFromEndOfLinkedList(head, 3);
    }

    private static void getNthNodeFromEndOfLinkedList(Node head, int pos) {
        int size = findLengthOfLinkedList(head);
        int counter = 1;
        String result = "Not found";
        while (head != null) {
            if(counter == (size-pos)+1) {
                result = "Found and Data = "+(head.data);
            }
            counter++;
            head = head.next;
        }
        System.out.println(result);
    }

    private static void getNthNodeFromLinkedList(Node head, int pos) {
        int counter = 1;
        String result = "Not found";
        while (head != null) {
            if(counter == pos) {
                result = "Found and Data = "+(head.data);
            }
            counter++;
            head = head.next;
        }
        System.out.println(result);
    }

    private static void deleteALinkedList(Node head) {
        System.out.println("Before deleting the whole linked list");
        printLinkedList(head);

        head = null;
        System.out.println();

        System.out.println("After deleting the whole linked list");
        printLinkedList(head);
    }

    private static void deleteANodeAtAGivenPosition(Node head, int pos) {
        System.out.println("Before deleting");
        printLinkedList(head);
        int counter = 1;

        Node current = head;
        while (current.next != null) {
            if(counter == pos-1) {
                Node temp = current.next.next;
                current.next = temp;
                break;
            }
            counter++;
            current = current.next;
        }

        System.out.println();
        System.out.println("After deleting");
        printLinkedList(head);
    }

    private static void deleteAGivenKey(Node head, int key) {
        System.out.println("Before deleting");
        printLinkedList(head);
        Node current = head;
        while (current.next != null) {
            if (current.next.data == key) {
                current.next = current.next.next;
            }
            current = current.next;
        }

        System.out.println("After deleting");
        printLinkedList(head);
    }

    private static void searchLinkedList(Node head, int key) {
        printLinkedList(head);
        String result = "Key is not found";
        int pos = 0;
        while (head != null) {
            if (head.data == key) {
                result = "Key: " + key + " is found at pos: " + (pos + 1);
                break;
            }
            pos++;
            head = head.next;
        }
        System.out.println();
        System.out.println(result);
    }

    private static Node insertAtASpecificPosition(Node head, Node newNode, int pos) {
        int counter = 1;
        Node current = head;
        while (current != null) {
            if (counter == pos - 1) {
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
                break;
            }
            current = current.next;
            counter++;
        }
        return head;
    }

    private static Node insertBeforeAGivenNode(Node head, Node newNode, int data) {
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
                break;
            }
            current = current.next;
        }
        return head;
    }

    private static Node insertAfterAGivenNode(Node head, Node newNode, int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
                break;
            }
            current = current.next;
        }
        return head;
    }

    private static Node insertAtEnd(Node head, Node newNode) {
       Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return head;
    }

    private static Node insertAtFront(Node head, Node newNode) {
        newNode.next = head;
        return newNode;
    }

    private static int findLengthOfLinkedList(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        System.out.println("Length of linked List : " + length);
        return length;
    }

    private static void printLinkedList(Node head) {

        if(head == null) {
            System.out.print("The linked list empty/null");
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}