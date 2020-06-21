package LeetcodeAmazon;

import java.util.Stack;

public class reverseLinkedList {
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

    /**
     * T: O(n)
     * S: O(n)
     * using stack here, not the ideal solution.
     */
    class Solution2 {
        public ListNode reverseList(ListNode head) {
            Stack<Integer> stack = new Stack<Integer>();
            ListNode output = new ListNode(-1);

            while (head != null) {
                stack.push(head.val);
                head = head.next;
            }

            head = output;

            while (!stack.isEmpty()) {
                head.next = new ListNode(stack.pop());
                head = head.next;
            }
            return output.next;
        }
    }
}
