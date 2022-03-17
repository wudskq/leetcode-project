package cn.com.wudskq.easy;

import lombok.Data;

import java.util.HashSet;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_141.java
 * @Description TODO 141.环形链表,判断链表中是否有环
 * @createTime 2022年03月17日 11:05:00
 */
public class LeetCode_141 {


    private HashSet<ListNode> hashSet;


    public LeetCode_141(){
        this.hashSet = new HashSet<>();
    }


    //设置一个哈希表,遍历链表,进行判断,若哈希表中存在则为环形
    //若不存在则把当前节点加入哈希表
    public boolean hasCycle(ListNode head) {
        ListNode temp= head;
        while (temp != null){
            //添加不成功即代表有重复元素即环形链接上了
            if(!hashSet.add(temp)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //创建快满指针 slow,fast 快指针始终比慢指针快两个下标
    //即若有环,快指针先进入到环,慢指针后进入环,快指针总会与慢指针相遇
    //若相遇则证明有环
    public boolean hasCycle1(ListNode head) {
        if(null == head || null == head.next){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if(null == fast || null == fast.next){
                return false;
            }
            //慢指针移动一步
            slow = slow.next;
            //快指针移动两步
            fast = fast.next.next;
        }
        return true;
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
