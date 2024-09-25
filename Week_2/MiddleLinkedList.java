package Week_2;

public class MiddleLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printNode(middleNode(head));
    }

    public static void printNode(ListNode head) {
        ListNode prev = head;
        while(head != null) {
            System.out.print(prev.val + " ");
            head = head.next;
            prev = head;
        }
    }

    public static ListNode middleNode(ListNode head) {
        if(head.next == null) {
            return head;
        }
        ListNode temp = head;
        int counter = 0;
        while(temp.next != null) {
            temp = temp.next;
            counter++;
        }
        counter = (counter + 1) / 2;
        while(counter > 0) {
            head = head.next;
            counter--;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}
