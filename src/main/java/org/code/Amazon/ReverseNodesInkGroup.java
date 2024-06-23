package org.code.Amazon;

/**
 * T: O(nK)
 * S: O(1)
 */
public class ReverseNodesInkGroup {
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
        //https://www.youtube.com/watch?v=jTWEmztptCQ&ab_channel=CodingwithConner
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode root = new ListNode(0, head);
            ListNode cur = head;
            ListNode prev = root;

            while (cur != null) {
                ListNode tail = cur;
                int index = 0;

                while (cur != null && index < k) {
                    cur = cur.next;
                    index++;
                }

                if (index != k) {
                    prev.next = tail;
                } else {
                    prev.next = reverse(tail, k);
                    prev = tail;
                }
            }
            return root.next;
        }

        public ListNode reverse(ListNode head, int k) {
            ListNode prev = null;
            ListNode current = head;

            while (current != null && k-- > 0) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
            return prev;
        }
    }
}
