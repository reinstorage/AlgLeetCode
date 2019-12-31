package 链表;

public class _237_删除链表中的节点 {

    /*
    * 237.删除链表中的节点
    * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
    */
    public void deleteNode(ListNode node) {
        // 用node下一个节点的值来覆盖当前要删除的node
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
