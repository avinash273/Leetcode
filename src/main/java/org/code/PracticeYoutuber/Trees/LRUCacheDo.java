package org.code.PracticeYoutuber.Trees;

import java.util.HashMap;

/**
 * T: O(1)
 * S: O(n)
 */
public class LRUCacheDo {
    class LRUCache {

        class Node {
            int key;
            int val;
            Node prev;
            Node next;
        }

        final Node head = new Node();
        final Node tail = new Node();
        HashMap<Integer, Node> nodeMap;
        int cacheCapacity;

        //this code is to add new node
        public void add(Node node) {
            Node nextNode = head.next;
            head.next = node;
            node.prev = head;
            node.next = nextNode;
            nextNode.prev = node;

        }

        //this code is to remove a node
        public void remove(Node node) {
            Node nextNode = node.next;
            Node prevNode = node.prev;
            nextNode.prev = prevNode;
            prevNode.next = nextNode;
        }

        public LRUCache(int capacity) {
            nodeMap = new HashMap(capacity);
            this.cacheCapacity = capacity;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            int result = -1;
            Node node = nodeMap.get(key);
            if (node != null) {
                result = node.val;
                remove(node);
                add(node);
            }
            return result;
        }

        public void put(int key, int value) {
            Node node = nodeMap.get(key);
            if (node != null) {
                remove(node);
                node.val = value;
                add(node);
            } else {
                if (nodeMap.size() == cacheCapacity) {
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
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
