package org.code.Apple;

public class reverseLinkedList {
    class ListNode {
        int val;
        ListNode next;
    }

    class Solution {
        public ListNode reverseList(ListNode curr) {
            ListNode prev = null;

            while (curr != null) {
                ListNode currNext = curr.next;
                curr.next = prev;
                prev = curr;
                curr = currNext;
            }
            return prev;
        }
    }
}
