package PracticeYoutuber.Trees;

import java.util.PriorityQueue;

/**
 * T: O(n log k)
 * S: O(nk)
 * good problem, retry without heap
 */
public class MergeKSortedLists {

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

            for (ListNode list : lists) {
                while (list != null) {
                    minHeap.add(list.val);
                    list = list.next;
                }
            }

            ListNode head = new ListNode(-1);
            ListNode returnHead = head;

            while (!minHeap.isEmpty()) {
                head.next = new ListNode(minHeap.remove());
                head = head.next;
            }
            return returnHead.next;
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution2 {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (ListNode node : lists) {
                while (node != null) {
                    minHeap.add(node.val);
                    node = node.next;
                }
            }

            ListNode head = new ListNode(-1);
            ListNode dummy = head;

            while (!minHeap.isEmpty()) {
                head.next = new ListNode(minHeap.remove());
                head = head.next;
            }
            return dummy.next;
        }
    }

    class Solution3 {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (ListNode list : lists) {
                while (list != null) {
                    minHeap.add(list.val);
                    list = list.next;
                }
            }

            ListNode head = new ListNode();
            ListNode dummy = head;

            while (!minHeap.isEmpty()) {
                head.next = new ListNode(minHeap.remove());
                head = head.next;
            }
            return dummy.next;
        }
    }
}
