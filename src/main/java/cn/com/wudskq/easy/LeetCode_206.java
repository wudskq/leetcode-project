package cn.com.wudskq.easy;

import lombok.Data;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_206.java
 * @Description TODO 206. 反转链表
 * @createTime 2022年03月27日 20:24:00
 */

public class LeetCode_206 {

    static ListNode head;

    public LeetCode_206(){
        head = new ListNode(0, null);
        ListNode node1 = new ListNode(1, null);
        ListNode node2 = new ListNode(2, null);
        ListNode node3 = new ListNode(3, null);
        ListNode node4 = new ListNode(4, null);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
    }


    public static void main(String[] args) {
        LeetCode_206 leetCode206 = new LeetCode_206();
        ListNode listNode = leetCode206.reverseList(head);
        System.out.println(listNode);
    }


    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        //无限正序遍历直至链表指针最后
        while (current != null){
            ListNode next = current.next;
            //使当前节点next指针指向左边节点
            current.next = pre;
            //节点同时后移
            pre = current;
            current = next;
        }
        return pre;
    }


    @Data
    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
