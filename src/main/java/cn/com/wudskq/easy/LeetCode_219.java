package cn.com.wudskq.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_219.java
 * @Description TODO 219.是否存在重复元素
 * @createTime 2022年03月19日 19:30:00
 */

public class LeetCode_219 {


    public static void main(String[] args) {
       int[] nums = {1,0,1,1};
       System.out.println(containsNearbyDuplicate(nums, 1));
    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        //key存数组的数据,value存储数组的下标
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //存储数据下标
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(nums[i]) && i - hashMap.get(nums[i]) <= k){
                return true;
            }else {
                hashMap.put(nums[i],i);
            }
        }
        return false;
    }
}
