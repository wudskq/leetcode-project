package cn.com.wudskq.easy;

import java.util.HashMap;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode1.java
 * @Description TODO 1. 两数之和
 * TODO 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * @createTime 2022年03月16日 02:03:00
 */

public class LeetCode_1 {

    private static int[] nums = {2, 7, 7, 15};

    private static int target = 9;


    public static void main(String[] args) {
        int[] ints = twoSum1(nums, 14);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //判断目标值减去数组中的值,差值是否存在于map中
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }else {
                //存放数组值与Index
                hashMap.put(nums[i],i);
            }
        }
        return new int[0];
    }

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                //越过相同坐标重复相加
                if(i != j){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[0];
    }
}
