package org.code.Amazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class AddSumLinkedList {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode dummy = head;

            int carry = 0;

            while (l1 != null || l2 != null) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = x + y + carry;
                int yu = 0;

                carry = sum / 10;
                dummy.next = new ListNode(sum % 10);
                dummy = dummy.next;

                if (l1 != null)
                    l1 = l1.next;

                if (l2 != null)
                    l2 = l2.next;
            }

            if (carry > 0)
                dummy.next = new ListNode(carry);

            return head.next;
        }
    }
}
