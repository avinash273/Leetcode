package LeetcodeTreesLinkedList;

/**
 * T: O(n)
 * S: O(1)
 */
public class reorderLinkedList {

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
        public void reorderList(ListNode head) {
            if (head == null || head.next == null) return;
            //head of first hald
            ListNode l1 = head;
            //head of second half
            ListNode slow = head;


            ListNode fast = head;
            ListNode prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            prev.next = null;
            ListNode l2 = reverse(slow);

            merge(l1, l2);
        }


        public void merge(ListNode l1, ListNode l2) {
            while (l1 != null) {
                ListNode l1Next = l1.next;
                ListNode l2Next = l2.next;

                l1.next = l2;
                if (l1Next == null) {
                    break;
                }
                l2.next = l1Next;
                l1 = l1Next;
                l2 = l2Next;
            }
        }

        public ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode currentNode = head;

            while (currentNode != null) {
                ListNode nextNode = currentNode.next;
                currentNode.next = prev;
                prev = currentNode;
                currentNode = nextNode;
            }
            return prev;
        }
    }
}
