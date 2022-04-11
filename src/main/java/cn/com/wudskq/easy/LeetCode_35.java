package cn.com.wudskq.easy;

/**
 * @author chenfangchao
 * @title: LeetCode_35
 * @projectName leetcode-project
 * @description: TODO 35. 搜索插入位置
 * @date 2022/4/5 7:18 AM
 */
public class LeetCode_35 {

    static int[] array = {1,2,5,6,8,10,20};


    public static void main(String[] args) {
        LeetCode_35 leetCode35 = new LeetCode_35();
        System.out.println(leetCode35.searchInsert(array, 10));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int res = 0;
        while (left <= right){
            int mid = left + (right-left)/2;
            int num = nums[mid];
            if(target <= num){
                res = mid;
                right = mid -1;
            }else {
                left = mid +1;
            }
        }
        return res;
    }
}
