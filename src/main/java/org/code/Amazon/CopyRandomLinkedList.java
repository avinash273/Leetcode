package org.code.Amazon;

import java.util.HashMap;

public class CopyRandomLinkedList {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    /**
     * T: O(n)
     * S: O(n)
     */
    class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) return head;

            HashMap<Node, Node> map = new HashMap<>();

            //Loop1 just to copy to map
            Node newHead = head;
            while (newHead != null) {
                map.put(newHead, new Node(newHead.val));
                newHead = newHead.next;
            }

            //Loop2 Make connections
            newHead = head;

            while (newHead != null) {
                map.get(newHead).next = map.get(newHead.next);
                map.get(newHead).random = map.get(newHead.random);
                newHead = newHead.next;
            }
            return map.get(head);
        }
    }
}
