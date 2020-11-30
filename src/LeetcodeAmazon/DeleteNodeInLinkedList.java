package LeetcodeAmazon;

/**
 * T: O(1)
 * S: O(1)
 */

public class DeleteNodeInLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
