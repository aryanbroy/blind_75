class ListNode {
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

public class q15 {
    public static void main(String args[]) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // Suggested one 100% time complex, 41.55mb

        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;

        // My approach 100% time complex, 41.74mb

        // int count = 0;

        // ListNode temp = head;

        // while (temp.next != null) {
        // count++;
        // temp = temp.next;
        // }

        // if (n == count) {
        // return head.next;
        // }

        // int loopTo = count - n;

        // int i = 1;
        // ListNode currElemHead = head;
        // ListNode traverse = currElemHead;

        // while (i < loopTo) {
        // traverse = traverse.next;
        // i++;
        // }

        // if (traverse.next != null) {
        // traverse.next = traverse.next.next;
        // } else {
        // traverse.next = null;
        // }
        // return currElemHead;
    }
}