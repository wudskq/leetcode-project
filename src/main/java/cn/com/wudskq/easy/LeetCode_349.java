package cn.com.wudskq.easy;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_349.java
 * @Description TODO 349. 两个数组的交集
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序
 * @createTime 2022年03月25日 10:08:00
 */

public class LeetCode_349 {


    public static int[] nums1 = {4,9,5};
    public static int[] nums2 = {9,4,9,8,4};

    public static void main(String[] args) {
        LeetCode_349 leetCode349 = new LeetCode_349();
        int[] intersection = leetCode349.intersection1(nums1, nums2);
        System.out.println(intersection.toString());
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        //存储num1数据
        HashSet<Integer> data = new HashSet<>();
        //转换num1为list
        List<Integer> arrayList = new ArrayList<>();
        //存储结果
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            arrayList.add(nums1[i]);
        }
        //nums1数据去重
        List<Integer> arrayList1 = arrayList.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < arrayList1.size(); i++) {
               data.add(arrayList1.get(i));
        }
        //判断nums2数据是否相交
        for (int i = 0; i < nums2.length; i++) {
            if (data.contains(nums2[i])) {
                list.add(nums2[i]);
            }
        }
        List<Integer> res = list.stream().distinct().collect(Collectors.toList());
        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    public int[] intersection1(int[] nums1, int[] nums2){
        //存储nums1数据
        HashSet<Integer> set1 = new HashSet<>();
        //存储结果
        HashSet<Integer> set2 = new HashSet<>();
        //存储num2数据
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer item:nums1) {
            set1.add(item);
        }
        for (Integer item:nums2) {
            list.add(item);
        }
        list.retainAll(set1);
        set2.addAll(list);
        return set2.stream().mapToInt(i->i).toArray();
    }

}
