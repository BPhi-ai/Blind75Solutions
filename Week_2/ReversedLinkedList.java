package Week_2;

public class ReversedLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printList(reverseList(head));
    }

    public static void printList(ListNode head) {
        ListNode prev = head;

        while(head != null) {
            System.out.print(prev.val + " ");
            head = head.next;
            prev = head;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}
