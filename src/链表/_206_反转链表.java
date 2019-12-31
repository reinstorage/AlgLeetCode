package 链表;

public class _206_反转链表 {

    /*
     * 206.反转链表
     * https://leetcode-cn.com/problems/reverse-linked-list/
     */
    public ListNode reverseList(ListNode head) {

        //1.递归方法
//        if(head == null || head.next == null) return head;
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;//处理反转到最后一个的情况
//        head.next = null;
//        return  newHead;

        //2.迭代方法

        //存储前一个节点
        ListNode prev = null;
        //存储当前节点
        ListNode cur = head;

        while (cur != null){

            ListNode nextTemp = cur.next;
            //开始反转，让当前的next指向其前一个节点
            cur.next = prev;
            //两个变量继续往后移动
            prev = cur;
            cur = nextTemp;
        }

        return prev;

    }
}
