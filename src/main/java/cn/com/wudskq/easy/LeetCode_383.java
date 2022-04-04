package cn.com.wudskq.easy;

import java.util.*;

/**
 * @author chenfangchao
 * @title: LeetCode_383
 * @projectName leetcode-project
 * @description: TODO 383.赎金信
 * @date 2022/4/5 5:41 AM
 */
public class LeetCode_383 {

    static String ransomNote = "aa";

    static String magazine = "aab";


    public static void main(String[] args) {
        LeetCode_383 leetCode383 = new LeetCode_383();
        System.out.println(leetCode383.canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Integer,Character> hashMap = new HashMap<>();
        //magazine数据入map
        for (int i = 0; i <  magazine.length(); i++) {
            hashMap.put(i,magazine.charAt(i));
        }
        //ransomNote依次去匹配
        for (int i = 0; i < ransomNote.length(); i++) {
            char data = ransomNote.charAt(i);
            //ransomNote每个字符与map中的每个值做对比
            for(Map.Entry<Integer, Character> entry : hashMap.entrySet()) {
                //判断是否包含在map的Values中
                //若不包含则证明ransomNote中的字符,magazine中找不到直接返回false即可
                if(hashMap.containsValue(data)){
                    //比对成功直接移除map中的值退出
                    if(entry.getValue().equals(data)){
                        hashMap.remove(entry.getKey());
                        //map中的值每个值只能用一次
                        break;
                    }
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
