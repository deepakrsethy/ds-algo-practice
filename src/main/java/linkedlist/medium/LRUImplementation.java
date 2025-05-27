package linkedlist.medium;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            next = null;
            prev = null;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> cache = new HashMap<>();
    private final Node head = new Node(0,0); //dummy Head
    private final Node tail = new Node(0,0); //dummy tail

    public LRUCache(int capacity) {
        this.capacity = capacity;

        //initialise the linked list as empty
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }

        Node node = cache.get(key);
        remove(node);
        insertToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        if(cache.size() == capacity) {
            Node lru = tail.prev;
            remove(lru);
        }
        Node newNode = new Node(key, value);
        insertToFront(newNode);
    }

    // Helper to insert a node right after head
    private void insertToFront(Node node) {
        cache.put(node.key, node);
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    // Helper to remove a node from the linked list and map
    private void remove(Node node) {
        cache.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

}
