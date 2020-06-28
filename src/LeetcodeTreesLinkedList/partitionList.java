package LeetcodeTreesLinkedList;

/**
 * easy but, important question
 * T: O(n)
 * S: O(1)
 * https://leetcode.com/problems/partition-list/
 */

public class partitionList {

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
        public ListNode partition(ListNode head, int x) {
            ListNode beforeHead = new ListNode(-1);
            ListNode before = beforeHead;
            ListNode afterHead = new ListNode(-1);
            ListNode after = afterHead;

            while (head != null) {
                if (head.val < x) {
                    before.next = head;
                    before = before.next;
                } else {
                    after.next = head;
                    after = after.next;
                }
                head = head.next;
            }
            after.next = null;
            before.next = afterHead.next;
            return beforeHead.next;
        }
    }
}
