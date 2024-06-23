package org.code.LeetcodeTreesLinkedList;

/**
 * Amazon
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 * T: O(n)
 * S: O(1)
 */
public class swapNodesPairs {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode temp = new ListNode(-1);
            temp.next = head;
            ListNode current = temp;

            while (current.next != null && current.next.next != null) {
                ListNode firstNode = current.next;
                ListNode secondNode = current.next.next;

                //now swap
                firstNode.next = secondNode.next;
                current.next = secondNode;
                current.next.next = firstNode;
                current = current.next.next;
            }
            return temp.next;
        }
    }
}
