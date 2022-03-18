package cn.com.wudskq.easy;

import java.util.HashSet;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_217.java
 * @Description TODO 数组中是否存在重复元素
 * @createTime 2022年03月18日 16:35:00
 */
public class LeetCode_217 {



    //利用hashset元素不重复特性实现
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashSet.contains(nums[i])){
                return true;
            }else {
                hashSet.add(nums[i]);
            }
        }
        return false;
    }


}
