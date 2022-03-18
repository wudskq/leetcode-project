package cn.com.wudskq.easy;

import java.util.HashSet;

/**
 * @author chenfangchao
 * @version 1.0.0
 * @ClassName LeetCode_202.java
 * @Description TODO 202.快乐数
 * @createTime 2022年03月19日 01:21:00
 */

public class LeetCode_202 {


    public static void main(String[] args) {
        LeetCode_202 leetCode202 = new LeetCode_202();
        int data = leetCode202.squareSum(333);
        System.out.println(leetCode202.isHappy(data));
    }

    public boolean isHappy(int n) {
        //创建hashset
        HashSet<Integer> hashSet = new HashSet<>();
        //循环判断计算出的n是否等于1并且set中是否包含
        //set中若包含则证明该数出现了循环,即不为快乐数
        while (n !=1 && !hashSet.contains(n)){
            hashSet.add(n);
            n = squareSum(n);
        }
        return n==1;
    }


    //拆数据求平方和
    public int squareSum(int number){
        //创建辅助变量
        int totalNum = 0;
        while(number >0){
            //循环获取number个位数值
            int data = number %10;
            number = number /10;
            totalNum += data*data;
        }
        return  totalNum;
    }
}
