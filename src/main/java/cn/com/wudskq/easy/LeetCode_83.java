package cn.com.wudskq.easy;

import lombok.Data;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_83.java
 * @Description TODO 83. 删除排序链表中的重复元素
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 * @createTime 2022年03月16日 10:27:00
 */

public class LeetCode_83 {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(null == head){
            return null;
        }
        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }


//    public ListNode deleteDuplicates1(ListNode head) {
//        ListNode temp = head;
//        ListNode fast = temp.next;
//        ListNode slow = temp;
//        if(null == head){
//            return null;
//        }
//        while(fast != null){
//            if(slow.val== fast.val){
//                slow.next = fast.next;
//            }else{
//                slow = slow.next;
//                fast = fast.next;
//            }
//        }
//        return head;
//    }


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
