package exercises;


public class ReverseListNode {
    public ListNode reverseList(ListNode head) {
        ListNode pReversedHead = head;
        ListNode pNode = head;
        ListNode pPrev = null;
        while (pNode != null) {
            ListNode pNext = pNode.next;
            if (pNext == null) {
                pReversedHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        head = pReversedHead;
        return head;
    }

    public static void main(String[] args){
        ListNode listNode01 = new ListNode(1);
        ListNode listNode02 = new ListNode(2);
        ListNode listNode03 = new ListNode(3);
        listNode01.setNext(listNode02);
        listNode02.setNext(listNode03);


        ReverseListNode reverseListNode = new ReverseListNode();
        ListNode h = listNode01;
        while (null != h) {
            System.out.print(h.getVal() + " ");
            h = h.getNext();
        }
        System.out.println("\n***********上半部分为反转前，下半部分为反转后***************");
        h = reverseListNode.reverseList(listNode01);
        while (null != h) {
            System.out.print(h.getVal() + " ");
            h = h.getNext();
        }
    }

}
