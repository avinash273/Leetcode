package LeetcodeAmazon;

import java.util.PriorityQueue;

/**
 * T: O(n)
 * S: O(n)
 * very good and easy problem
 * would like to revist, just because it felt so easy do it
 */

public class mergeKsortedList {

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
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (ListNode head : lists) {
                while (head != null) {
                    minHeap.add(head.val);
                    head = head.next;
                }
            }

            ListNode dummy = new ListNode(-1);

            ListNode head = dummy;

            while (!minHeap.isEmpty()) {
                head.next = new ListNode(minHeap.remove());
                head = head.next;
            }
            return dummy.next;
        }
    }
}
