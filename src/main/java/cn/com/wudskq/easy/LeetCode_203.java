package cn.com.wudskq.easy;

import lombok.Data;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_236.java
 * @Description TODO 203.移除链表元素
 * @createTime 2022年03月27日 01:46:00
 */

public class LeetCode_203 {


    static ListNode head;

    public LeetCode_203(){
        head = new ListNode(1, null);
        ListNode node1 = new ListNode(1, null);
        ListNode node2 = new ListNode(1, null);
        ListNode node3 = new ListNode(3, null);
        ListNode node4 = new ListNode(4, null);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
    }


    public static void main(String[] args) {
        LeetCode_203 leetCode203 = new LeetCode_203();
        ListNode listNode = leetCode203.removeElements(head, 1);
        System.out.println(listNode);
    }


    public ListNode removeElements(ListNode head, int val) {
        ListNode var = new ListNode(1, null);
        var.next = head;
        //设置辅助节点
        ListNode temp = var;
        //遍历链表直到最后一个节点
        while (temp.next != null){
            //找到要删除节点的上一个节点
            if(temp.next.val== val){
                //删除值等于val的节点
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return var.next;
    }
}

@Data
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}




