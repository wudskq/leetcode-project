package cn.com.wudskq.easy;

/**
 * @author chenfangchao
 * @title: LeetCode_26
 * @projectName leetcode-project
 * @description: TODO 26.删除有序数组中的重复项
 * @date 2022/4/1 2:47 AM
 */
public class LeetCode_26 {


    static int[] nums = {1,2,2,3,4,5,6};


    public static void main(String[] args) {
        LeetCode_26 leetCode26 = new LeetCode_26();
        System.out.println(leetCode26.removeDuplicates(nums));

    }

    public int removeDuplicates(int[] nums) {
        int slow = 1,fast = 1;
        int length = nums.length;
        if(0 == length){
            return 0;
        }
        while (fast < length){
            //判断fast指针指向的值是否与前一个想等
            //不想等时,使用slow指针覆盖数组数据
            if(nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
