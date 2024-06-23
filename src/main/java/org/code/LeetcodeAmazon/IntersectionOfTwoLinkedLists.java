package org.code.LeetcodeAmazon;

/**
 * T: O(n+m)
 * S: O(1)
 */
public class IntersectionOfTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null)
                return null;

            ListNode aPointer = headA;
            ListNode bPointer = headB;

            while (aPointer != bPointer) {
                if (aPointer == null)
                    aPointer = headB;
                else
                    aPointer = aPointer.next;

                if (bPointer == null)
                    bPointer = headA;
                else
                    bPointer = bPointer.next;

            }
            return aPointer;
        }
    }
}
