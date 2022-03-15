package cn.com.wudskq.easy;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_27.java
 * @Description TODO 27.移除元素
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素
 * @createTime 2022年03月16日 02:50:00
 */

public class LeetCode_27 {


    private static int[] nums  ={3,2,2,3};
    private static int val = 3;

    public static void main(String[] args) {
        removeElement(nums,val);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int left= 0;
        //不等于要删除的数据全部取出
        for (int right=0; right<nums.length;right++){
            if(nums[right]!=val){
                //覆盖掉原始数组
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
