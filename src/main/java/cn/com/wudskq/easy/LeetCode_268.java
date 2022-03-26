package cn.com.wudskq.easy;

import java.util.HashSet;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_268.java
 * @Description TODO 268. 丢失的数字
 * @createTime 2022年03月26日 22:31:00
 */

public class LeetCode_268 {


    static int[] nums = {0};


    public static void main(String[] args) {
        LeetCode_268 leetCode268 = new LeetCode_268();
        System.out.println(leetCode268.missingNumber(nums));
    }


    public int missingNumber(int[] nums) {
        if(null == nums && 0 >= nums.length){
            return 0;
        }
        //存储nums中的数据
        HashSet<Integer> numsData = new HashSet<>();
        //存储结果
        Integer res = null;
        for (Integer item:nums) {
            numsData.add(item);
        }
        for (int i = 0; i <= nums.length; i++) {
            if(!numsData.contains(i)){
                res  = i;
            }
        }
        return res;
    }
}
