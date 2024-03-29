package cn.com.wudskq.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_169.java
 * @Description TODO 169. 多数元素
 * @createTime 2022年03月26日 23:45:00
 */
public class LeetCode_169 {

    static int[] nums = {1,1,1,2,3,4,4,4,4,1,1};

    public static void main(String[] args) {
        LeetCode_169 leetCode169 = new LeetCode_169();
        System.out.println(leetCode169.majorityElement1(nums));
    }

    public int majorityElement(int[] nums) {
        //映射为每个数据出现的次数
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!count.containsKey(nums[i])){
                //hash中包含该key时,value则加1
                count.put(nums[i],1);
            }else {
                //hash中包含该key时,value则加1
                count.put(nums[i],count.get(nums[i])+1);
            }
        }
        Map.Entry<Integer, Integer> majorityEntry = null;
        Set<Map.Entry<Integer, Integer>> entries = count.entrySet();
        //遍历set
        for (Map.Entry<Integer, Integer> entry : entries) {
            //计算哪个元素出现的次数最多
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        //最后返回
        return majorityEntry.getKey();
    }

    //摩尔投票法
    public  int majorityElement1(int[] nums) {
        int cand_num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            //如果数组第一个元素与后面元素相同
            //则票数+1 //否则票数-1
            count += cand_num == nums[i]? 1:-1;
            //票数等于0时 更换候选人
            if( count == 0){
                cand_num = nums[i];
                count = 1;
            }
        }
        return cand_num;
    }

}
