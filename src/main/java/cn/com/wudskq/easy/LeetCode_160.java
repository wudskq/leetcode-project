package cn.com.wudskq.easy;

import lombok.Data;

import java.util.HashSet;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_160.java
 * @Description TODO 160.相交链表
 * TODO 给定两个链表(保证链表不为环),给定两个链表的头节点HeadA,HeadB
 * 找到相交的点并返回该点的值
 * @createTime 2022年03月18日 14:53:00
 */

public class LeetCode_160 {

    private HashSet<ListNode> hashSet;

    public LeetCode_160(){
        this.hashSet = new HashSet<>();
    }

    //使用hash集合特征实现
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        //遍历headA
        while (tempA != null){
            hashSet.add(tempA);
            tempA = tempA.next;
        }
        //遍历headB
        while (tempB != null){
            if(hashSet.contains(tempB)){
                return tempB;
            }
            tempB = tempB.next;
        }
        return null;
    }



    @Data
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
              val = x;
              next = null;
          }
    }
}
