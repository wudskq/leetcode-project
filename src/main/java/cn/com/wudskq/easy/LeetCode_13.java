package cn.com.wudskq.easy;

import lombok.Data;

import java.util.HashMap;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_13.java
 * @Description TODO 13. 罗马数字转整数 给定罗马数字 转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * @createTime 2022年03月17日 02:22:00
 */
@Data
public class LeetCode_13 {

    private String number = "";

    private HashMap<String, Integer> hashMap;

    public LeetCode_13() {
        this.hashMap = new HashMap<>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);
    }

    public static void main(String[] args) {
        LeetCode_13 leetCode13 = new LeetCode_13();
        System.out.println(leetCode13.romanToInt("III"));

    }

    public int romanToInt(String s) {
        int length = s.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            String charAt = String.valueOf(s.charAt(i));
            Integer value = hashMap.get(charAt);
            //防止下标越界
            //比对左边数数是否小于右边数
            if(i <length-1&&value<hashMap.get(String.valueOf(s.charAt(i+1)))){
                result -= value;
            }else {
                result += value;
            }
        }
        return result;
    }
}
