package cn.com.wudskq.easy;

/**
 * @author chenfangchao
 * @title: LeetCode_28
 * @projectName leetcode-project
 * @description: TODO
 * @date 2022/4/11 5:59 PM
 */
public class LeetCode_28 {

    static final String a = "abbbaa";
    static final String b = "abc";

    public static void main(String[] args) {
        System.out.println(strStr1(a, b));
    }


    //原生API
    public static int strStr(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        return i;
    }


    //暴力算法
    public static int strStr1(String haystack, String needle) {
        //主串
        char[] master = haystack.toCharArray();
        //主串位置
        int i =0;
        //模式串
        char[] pattern = needle.toCharArray();
        //模式串位置
        int j =0;
        while (i < master.length && j < pattern.length){
            if(master[i] == pattern[j]){
                i++;
                j++;
            }else {
                //主串位置后移一位
                i = i-j+1;
                //模式串位置重置
                j = 0;
            }
        }
        if(j == pattern.length){
            return i -j;
        }else {
            return -1;
        }
    }
}
