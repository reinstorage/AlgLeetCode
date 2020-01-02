package 链表;

public class _160_相交链表 {
    /*
     * 160.相交链表
     * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //相交法：走完相同的路程了 有相交点的话肯定相等，此思想类似快慢指针思想

        if(headA == null || headB == null){
            return  null;
        }

//        ListNode pA = headA;
//        ListNode pB = headB;
//
//        while (pA != pB){
//
//            pA = pA.next;
//            pB = pB.next;
//
//            if(pA == null && pB == null){
//                return null;
//            }
//
//            if (pA == null){
//                pA = headB;
//            }
//
//            if(pB == null){
//                pB = headA;
//            }
//        }
//
//        return pA;

        ListNode pA = headA, pB = headB;

        while (pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;
    }
}
