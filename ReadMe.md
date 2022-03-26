## LeetCode思路解析

### 项目结构说明:

- 该项目分为easy,secondary,difficulty(简单,中等,困难)
- 在每个包下分别会有leetcode相应的题解代码,Class名为leetcode的题号
- 解题对应的思路存放在ReadMe.md中,依据序号对应.eg: 类名为LeetCode19.java 则相关思路即为19开头的章节

### 19. 删除链表的倒数第 N 个结点

- 描述: 给你一个链表，删除链表的倒数第 `n` 个结点，并且返回链表的头结点。
- leetcode链接: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
- 核心思想:
  - 使用快慢指针即可解决,快指针永远先比慢指针走快n+1步,这个n即为题目中所指的倒数第几个
  - 即快指针与慢指针之间永远相隔n+1个距离
  - 然后快慢指针同时向后移动,当快指针等于null时,即代表已到链表最后,此时慢指针即为倒数第n-1个节点

### 1. 两数之和

- 描述: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。

- 链接：https://leetcode-cn.com/problems/two-sum
- 嵌套for循环核心思想:
  - 使用嵌套for循环,判断下标为第i个与第i+1的数据是否与target相等,相等则返回对应下标

- Map核心思想:
  - 实例化一个HashMap,Key存该数据的值,Value存该数组的下标
  - 遍历该数组,判断target-数组中的数nums[i]的结果是否存在于HashMap中的Key中,若存在即为num[i]+该HashMap中的匹配的key相加结果等于target
  - 返回HashMap该Key的值(数组下标)与i即可

### 27. 移除元素

- 描述: 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

  不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

  元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素

- 链接：https://leetcode-cn.com/problems/remove-element
- 核心思想: 
  - 设计两个指针,左指针与右指针(left,right)
  - 右指针用来遍历数组,并与要删除的元素进行比较
  - 左指针用来覆盖原始数组中的数据,将原始数组中的数据变为新的数组数据

### 83. 删除链表中重复的元素

- 描述: 给定一个已排序的链表的头 `head` ， *删除所有重复的元素，使每个元素只出现一次* 。返回 *已排序的链表* 。
- 链接: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
- 核心思想: 
  - 创建虚拟指针等于head,设置快慢指针,快指针比慢指针快一个距离
  - 循环遍历链表直到快指针等于null,
  - 比对快指针与慢指针的数据,如果相等则删除该快指针指向的节点(重新链接链表)
  - 最后返回head节点

### 20. 有效的括号

- 描述: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

  有效字符串需满足: 左括号必须用相同类型的右括号闭合。左括号必须以正确的顺序闭合。

- 链接：https://leetcode-cn.com/problems/valid-parentheses

- 核心思想:

  - 字符串长度为奇数的不符合条件

  - 实例化一个栈,栈中用来存放左括号

  - 实例化一个Map,该集合中Key存放右括号,Value存放左括号

  - 遍历该字符串,如果遇到左括号直接入栈,遇到右括号时,判断栈是否为空或者栈顶元素与该右括号对应的Value是否匹配

    如果不匹配返回false,匹配则栈顶元素弹出

  - 最后返回栈是否为空表达式,最后判断比对完成后,如果栈为空也证明该字符串都符合条件

### 13. 罗马数字转整数

- 描述: 给定一个罗马数字，将其转换成整数
- 链接: https://leetcode-cn.com/problems/roman-to-integer/
- 核心思想:
  - 实例化一个HashMap进行罗马字符与阿拉伯数据关系映射
  - 遍历该字符串
  - 判断左边是否小于右边,若小于右边的数,则该数取反
  - 直到遍历完字符串,最后返回result即可

### 141.判断链表为是否有环

- 描述: 给你一个链表的头节点 `head` ，判断链表中是否有环。如果链表中有某个节点，可以通过连续跟踪 `next` 指针再次到达，则链表中存在环
- 链接: https://leetcode-cn.com/problems/linked-list-cycle/
- Map核心思想:
  - 实例化一个HashSet,HashSet特点为元素不能重复
  - 遍历该链表,在遍历过程中判断是否有元素加入失败,若有加入失败情况,则证明指针又指向了相同的位置,即该链表上有环
  - 否则,指针右移
- 快满指针思想:

  - 创建快慢指针,遍历链表时,慢指针向右移动一步,快指针向右移动两步
  - 如果该链表为一个环,快指针比慢指针先进入环,两者总会相遇,判断是否相遇即可


### 160.相交链表

- 描述: 给你两个链表(该链表一定不为环形链表),headA,headB,判断该链表是否有相交点,若有相交点则返回该节点,若无相节点则返回null
- 链接: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/
- Hash核心思想:
  - 实例化一个HashSet,借助HashSet元素不能重复特性实现该算法
  - 首先遍历A链表,并将A链表所有节点加入该set中
  - 继续遍历B链表,遍历过程中判断B链接中有无节点与hashSet中的节点内存地址相等,若相等直接返回该节点,若不相等则指针指向下一个指针,直到遍历完B链表为止
  - 若遍历完B链表都无想等节点,则证明两个链表无相交点,返回null即可

### 217.数组中是否存在重复元素

- 描述: 给定一个数组,判断该数组中是否有重复元素,若有返回false,反之返回true
- 链接: https://leetcode-cn.com/problems/contains-duplicate/
- Hash核心思想：
  - 实例化一个HashSet,借助HashSet元素不能重复特性实现该算法
  - 遍历数组,遍历过程中判断该元素是否包含于hashMap中,若包含则返回ture,若不包含则将该元素加入到hash中,
  - 直到数组遍历完成,若还没有则返回false

### 202.快乐数

- 描述:编写一个算法来判断一个数 n 是不是快乐数,快乐数定义为: 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
  如果这个过程 结果为 1，那么这个数就是快乐数。
  如果 n 是 快乐数 就返回 true ；不是，则返回 false

- 链接：https://leetcode-cn.com/problems/happy-number

- 核心思想: 

  - 先创建一个可以计算整数平方和的函数,在实例化一个hashSet

    ```java
    public int squareSum(int number){
      int totalNum = 0;
      while(number >0){
        int data = number %10;
        number = number /10;
        total += data*data;
      }
    }
    ```

  - 循环将计算出的平方和加入到set中去,并在循环过程中判断结果是否等于1或者set中是否包含计算出的结果,

  - 若不等于1或者包含则证明该数计算的平方和结果出现了重复,即不为快乐数,

  - 反之则将数据循环加入到set中,直到循环遍历完成之后,最后返回结果

    ```java
    public boolean isHappy(int n){
      Hashset hash = new Hashset<Integer>();
      while(n !=1 && !hashSet.contains(n)){
        hash.add(n);
        n = squareSum(n);
      }
      return n ==1;
    }
    ```

- leetcode情况分析图示:

  ![image-20220319030159387](https://aliyun-images-service.oss-cn-hangzhou.aliyuncs.com/wudskq/data/20220319030204.png)

### 219.数组中是否存在重复元素(pro)

- 描述: 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false

- 链接：https://leetcode-cn.com/problems/contains-duplicate-ii

- 核心思想:

  - 创建一个hashMap,Key存储数组的值,Value存储数组的下标

  - 循环遍历数组,判断集合中是否包含相同的值,并且同时判断是否满足大的下标减去小的下标小于等于K

  - 反之将数据加入到map

  - 核心代码:

    ```java
    //key存数组的数据,value存储数组的下标
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    //存储数据下标
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < nums.length; i++) {
      //判断hash中是否包含相同的值,并且大的下标减去小的下标是否满足小于等于k
      if(hashMap.containsKey(nums[i]) && i - hashMap.get(nums[i]) <= k){
        return true;
      }else {
        hashMap.put(nums[i],i);
      }
    }
    return false;
    ```


### 314.两个数组的交集

- 描述:给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序
- 链接: https://leetcode-cn.com/problems/intersection-of-two-arrays/submissions/
- haseSet核心思想: 

  - 创建新的list
  - nums1转为list并去重,创建一个haseSet,用来存放nums1的数据
  - nums2遍历过程中并进行判断hashSet是否包含,若包含则将数据存入到一个list
  - 最后转换list为数组并返回

### 268. 丢失的数字

- 描述: 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数
- 链接: https://leetcode-cn.com/problems/missing-number/
- hashSet核心思想:
  - 创建一个hashSet
  - 遍历该array并将数字加入到hashset中去
  - 根据n的长度,从0开始循环并再循环过程中判断该数是否包含在hashset中
  - 若包含则不做任何操作,若不包含则将该数字返回

### 169. 多数元素

- 描述: 给定一个大小为 *n* 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 **大于** `⌊ n/2 ⌋` 的元素
- 链接: https://leetcode-cn.com/problems/majority-element/
- 核心思想1:
  - 实例化一个hashMap,用来记录数组中每个元素出现的次数,key存数组中的数据,value存储该元素出现的次数
  - 遍历完成后,转换map为set,并将set进行遍历比较value哪个大,最后将大的对象赋值给Map.Entry

