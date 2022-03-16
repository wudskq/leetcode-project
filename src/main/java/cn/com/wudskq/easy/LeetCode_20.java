package cn.com.wudskq.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_20.java
 * @Description TODO 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * @createTime 2022年03月16日 11:45:00
 */

public class LeetCode_20 {

    private Stack<Character> stack = new Stack<Character>();

    private HashMap<Character, Character> hashMap;


    public LeetCode_20() {
        this.hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        hashMap.put('}', '{');
    }


    public static void main(String[] args) {
        String s = "()[]{}";
        LeetCode_20 obj = new LeetCode_20();
        System.out.println(obj.isValid(s));
    }


    public boolean isValid(String s) {
        //长度为奇数时为false
        if (s.length() % 2 == 1) {
            return false;
        }
        //遍历进行判断
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            //判断是否为右括号
            if (hashMap.containsKey(charAt)) {
                //栈为空,或者栈顶数据与右括号对应的mao中value不匹配
                if (stack.isEmpty() || !stack.peek().equals(hashMap.get(charAt))) {
                    return false;
                }
                stack.pop();
            } else {
                //左括号入栈
                stack.push(charAt);
            }
        }
        //为空即全部匹配
        return stack.isEmpty();
    }
}
