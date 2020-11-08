package Amazon;

/**
 * T: O(n)
 * S: O(1)
 */
public class ReverseLinkedList {
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
        public ListNode reverseList(ListNode head) {
            ListNode dummy = head;
            ListNode prev = null;

            while (head != null) {
                ListNode currNext = head.next;
                head.next = prev;
                prev = head;
                head = currNext;
            }
            return prev;
        }
    }
}
