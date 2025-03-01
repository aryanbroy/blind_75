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

public class q17 {
    public static void main(String args[]) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;

        ListNode finalHead = new ListNode(-1);
        ListNode traverse = finalHead;

        while (p1 != null || p2 != null) {
            if (p1.val <= p2.val) {
                traverse.next = p1;
                p1 = p1.next;
            } else {
                traverse.next = p2;
                p2 = p2.next;
            }
            traverse = traverse.next;
        }

        while (p1 != null) {
            traverse.next = p1;
            p1 = p1.next;
            traverse = traverse.next;
        }

        while (p2 != null) {
            traverse.next = p2;
            p2 = p2.next;
            traverse = traverse.next;
        }
        return finalHead.next;
    }
}
