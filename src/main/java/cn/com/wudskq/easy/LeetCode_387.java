package cn.com.wudskq.easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author chenfangchao
 * @title: LeetCode_387
 * @projectName leetcode-project
 * @description: TODO 387.字符串中的第一个唯一字符
 * @date 2022/5/7 3:36 PM
 */
public class LeetCode_387 {


    static String s = "aadadaad";

    public static void main(String[] args) {
        System.out.println(firstUniqChar(s));
    }

    /* 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 */
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int length = s.length();
        String element = "";
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            //判断元素是否之前出现过 出现过不做任何操作
            if(element.contains(String.valueOf(c))){
            }else if(hashMap.containsKey(c)){
                //重复时移除元素
                element += c;
                hashMap.remove(c);
            }else {
                //存入数据 key=值 value=下标
                hashMap.put(c,i);
            }
        }
        List<Integer> collect = hashMap.values().stream().sorted().collect(Collectors.toList());
        if(null != collect && 0 < collect.size()){
            return collect.get(0);
        }else {
            return -1;
        }
    }
}
