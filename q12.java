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

public class q12 {
    public static void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstNode = head;
        ListNode secondNode = reverseLL(slow.next);
        slow.next = null;

        while (secondNode != null) {
            ListNode temp1 = firstNode.next, temp2 = secondNode.next;

            firstNode.next = secondNode;
            secondNode.next = temp1;

            firstNode = temp1;
            secondNode = temp2;
        }
    }

    public static ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
