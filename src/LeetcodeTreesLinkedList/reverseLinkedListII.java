package LeetcodeTreesLinkedList;

/**
 * T: O(n)
 * S: O(1)
 */
public class reverseLinkedListII {

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
        public ListNode reverseBetween(ListNode head, int m, int n) {
            if (head == null)
                return null;

            ListNode prev = null;
            ListNode currentNode = head;

            while (m > 1) {
                prev = currentNode;
                currentNode = currentNode.next;
                m--;
                n--;
            }
            ListNode connection = prev;
            ListNode tail = currentNode;

            while (n > 0) {
                ListNode nextNode = currentNode.next;
                currentNode.next = prev;
                prev = currentNode;
                currentNode = nextNode;
                n--;
            }

            if (connection != null) {
                connection.next = prev;
            } else {
                head = prev;
            }
            tail.next = currentNode;
            return head;
        }
    }
}
