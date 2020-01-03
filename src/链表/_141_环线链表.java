package 链表;

public class _141_环线链表 {
    /*
     * 141.环形链表
     * https://leetcode-cn.com/problems/linked-list-cycle/
     */

    public boolean hasCycle(ListNode head) {

        //利用快慢指针思想
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null){

            if (slow == fast) return  true;

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;

    }
}
