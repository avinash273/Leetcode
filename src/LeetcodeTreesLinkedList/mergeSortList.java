package LeetcodeTreesLinkedList;

/**
 * T: O(n log n)
 * S: (n)
 */

public class mergeSortList {
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
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null)
                return head;

            ListNode temp = head;
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                temp = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            temp.next = null;

            ListNode leftSide = sortList(head);
            ListNode rightSide = sortList(slow);

            return merge(leftSide, rightSide);
        }

        public ListNode merge(ListNode l1, ListNode l2) {
            ListNode sortedTemp = new ListNode(0);
            ListNode currentNode = sortedTemp;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    currentNode.next = l1;
                    l1 = l1.next;
                } else {
                    currentNode.next = l2;
                    l2 = l2.next;
                }
                currentNode = currentNode.next;
            }
            if (l1 != null) {
                currentNode.next = l1;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentNode.next = l2;
                l2 = l2.next;
            }
            return sortedTemp.next;
        }
    }
}
