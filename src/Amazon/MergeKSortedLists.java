package Amazon;

import java.util.PriorityQueue;


class MergeKSortedLists {
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

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);

        ListNode head = new ListNode(0);
        ListNode dummy = head;

        for (ListNode node : lists) {
            if (node != null)
                queue.add(node);
        }

        while (!queue.isEmpty()) {
            head.next = queue.poll();
            head = head.next;

            if (head.next != null)
                queue.add(head.next);
        }
        return dummy.next;
    }
}