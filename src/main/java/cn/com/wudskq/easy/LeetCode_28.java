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
    static final String b = "ac";

    public static void main(String[] args) {
        System.out.println(strStr(a, b));
    }

    public static int strStr(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        return i;
    }
}
