package cn.com.wudskq.secondary;

import lombok.Data;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_19.java
 * @Description TODO 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
 * @createTime 2022年03月16日 01:29:00
 */

public class LeetCode_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //保证慢指针比快指针多一个节点,即快指针与慢指针之间永远相隔n+1的距离
        ListNode temp = new ListNode(-1, head);
        ListNode fast = head;
        ListNode slow = temp;
        //快指针先移动n个距离
        for (int i = 0; i < n; ++i) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            //倒数第n+1个节点
            slow = slow.next;
        }
        //删除第n个节点数据,并重新进行指针链接
        slow.next = slow.next.next;
        //重新链接后的数据
        ListNode data = temp.next;
        return data;
    }

    @Data
    public class ListNode {
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
}

