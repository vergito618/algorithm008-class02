package week1;

/**
 * 21. 合并两个有序链表(第3课作业第3题)
 * 想到的解法：
 *    1.两个链表遍历合并到一个即可
 */
public class MergeSortLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null ) {
            return l2;
        }
        if ( l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(-1);
        ListNode prev = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return head.next;

    }
}



