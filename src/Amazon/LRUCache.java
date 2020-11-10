package Amazon;

import java.util.HashMap;

/**
 * T: O(1)
 * S: O(n)
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
class LRUCache {
    final Node head = new Node();
    final Node tail = new Node();

    HashMap<Integer, Node> nodeMap;
    int capacity;

    class Node {
        int key;
        int val;
        Node prev;
        Node next;
    }

    public LRUCache(int capacity) {
        nodeMap = new HashMap<>(capacity);
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = nodeMap.get(key);

        if (node == null)
            return -1;
        else {
            remove(node);
            add(node);
            return node.val;
        }
    }

    public void put(int key, int value) {
        Node node = nodeMap.get(key);
        if (node != null) {
            remove(node);
            node.val = value;
            add(node);
        } else {
            if (nodeMap.size() == capacity) {
                nodeMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            nodeMap.put(key, newNode);
            add(newNode);
        }
    }

    //add to the front of the list
    public void add(Node node) {
        Node headNext = head.next;
        node.next = headNext;
        headNext.prev = node;
        head.next = node;
        node.prev = head;
    }

    //remove from somewhere
    public void remove(Node node) {
        Node nextNode = node.next;
        Node prevNode = node.prev;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */