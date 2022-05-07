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

- 核心思想1(hashMap):

  - 实例化一个hashMap,用来记录数组中每个元素出现的次数,key存数组中的数据,value存储该元素出现的次数
  - 遍历完成后,转换map为set,并将set进行遍历比较value哪个大,最后将大的对象赋值给Map.Entry

- 核心思想2(摩尔投票法):

  - 创建一个候选人与一个票数的变量
  - 遍历数组,并将候选人初始值设置为nums[0],count=1
  - 遇到与候选人相同的则票数加一,否则票数减一
  - 并在遍历过程中判断票数是否等于零,若等于零则重置候选人与票数
  - 核心代码

  ```java
  //摩尔投票法
  public  int majorityElement1(int[] nums) {
    int cand_num = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      //如果数组第一个元素与后面元素相同
      //则票数+1 //否则票数-1
      count += cand_num == nums[i]? 1:-1;
      //票数等于0时 更换候选人
      if( count == 0){
        cand_num = nums[i];
        count = 1;
      }
    }
    return cand_num;
  }
  ```

### 203. 移除链表元素

- 描述: 给你一个链表的头节点 `head` 和一个整数 `val` ，请你删除链表中所有满足 `Node.val == val` 的节点，并返回新的头节点
- 链接: https://leetcode-cn.com/problems/remove-linked-list-elements/
- 核心思想:
  - 创建虚拟节点,使其next指针指向头节点,创建辅助节点,使其辅助节点等于虚拟节点
  - 通过辅助节点遍历该链表,直至该链表为空(即到尾部为止),
  - 在遍历过程中判断是否有节点的值与val相同,相同则删除该节点,反之指针后移
  - 最后返回该虚拟节点的next指针所指节点,即为新的head

### 206. 反转单向链表

- 描述: 给你单链表的头节点 `head` ，请你反转链表，并返回反转后的链表。

- 链接: https://leetcode-cn.com/problems/reverse-linked-list/

- 核心思想: 

  - 创建辅助指针Pre,Current,Next.(分别代表前一个节点,当前节点,及后一个节点)
  - 初始化Pre为NULL,Current等于Head,Next为NULL
  - 遍历链表,在遍历过程中,使当前节点的next指针指向Pre,随后移动Pre到当前节点,移动Current到Next节点
  - 直至Current 等于NULL时,则证明到了链表尾部,最后返回Pre

- 图示:

  ![image-20220327210633126](https://aliyun-images-service.oss-cn-hangzhou.aliyuncs.com/wudskq/data/20220327211838.png)

  ![image-20220327212205110](https://aliyun-images-service.oss-cn-hangzhou.aliyuncs.com/wudskq/data/20220327212205.png)

### 26.原地移除数组中重复元素

- 描述: 给你一个 **升序排列** 的数组 `nums` ，请你**[ 原地](http://baike.baidu.com/item/原地算法)** 删除重复出现的元素，使每个元素 **只出现一次** ，返回删除后数组的新长度。元素的 **相对顺序** 应该保持 **一致** 。

- 链接: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/

- 核心思想: 使用快慢指针解决该问题

  - 创建slow,fast指针,并使其初始化值为1,快指针用来遍历数组,慢指针用来重新覆盖数组值

  - 无限循环,并在循环中判断快指针所指向的值是否与前一个值想等,若不想等,则使用slow慢指针重新覆盖数组

    并且快慢指针同时加1,直到fast快指针大于数组长度时(即该数组已遍历到最后)

### 383.赎金信

- 描述:

- 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

  如果可以，返回 true ；否则返回 false 。

  magazine 中的每个字符只能在 ransomNote 中使用一次。

- 链接: https://leetcode-cn.com/problems/ransom-note/

- 核心思想1:

  - 创建hashMap,key存储该下标,value存储值
  - 遍历magazine字符串,存入到hashMap中
  - 接着再遍历 ransomNote字符串中的每个字符,并判断hashMap包含此字符串,若包含找到该字符串对应的key,并在hashMap中删除,若不包含则直接返回false
  - 核心代码:

  ```java
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
  ```


### 35.搜索插入位置

- 描述: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

  请必须使用时间复杂度为 O(log n) 的算法。

- 链接: https://leetcode-cn.com/problems/search-insert-position

- 核心思想:

  - 使用二分法查找即可

- 核心代码

  ```java
   int left = 0;
          int right = nums.length -1 ;
          int res = nums.length;
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
  ```


### 28.实现 strStr() 函数

- 描述: 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。

- 链接：https://leetcode-cn.com/problems/implement-strstr

- 核心思想: 两种解法 > 1.调用Java原生API 2.暴力算法 3.使用KMP算法 

- 原生API核心代码

  ```java
  public static int strStr(String haystack, String needle) {
    int i = haystack.indexOf(needle);
    return i;
  }
  ```

- 暴力算法

  ```java
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
  ```


### 29.两数相除(未做)

- 描述: 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。

  返回被除数 dividend 除以除数 divisor 得到的商。

  整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2

- 链接: https://leetcode-cn.com/problems/divide-two-integers

- 核心思想:

### 387. 字符串中的第一个唯一字符

- 描述: 给定一个字符串 `s` ，找到 *它的第一个不重复的字符，并返回它的索引* 。如果不存在，则返回 `-1` 

- 链接: https://leetcode-cn.com/problems/first-unique-character-in-a-string/

- 核心思想:

  - 创建hashMap存储字符串值与下标
  - 创建临时字符存储字符中出现过的元素
  - 遍历字符串,若重复则移除或不做任何操作,不重复则存储进入hashMap中
  - 最后hashMap转为list并进行排序,返回list的第一个元素的下标即可

- 核心代码:

  ```java
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
  ```

- 核心思想:

  - 创建哈希表存储字符出现的次数(在遍历字符串第一遍时)
  - 第二遍遍历字符串时找出现频次等于1的字符对应的下标
  - 返回下标即可

- 核心代码:

  ```java
  /* 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 */
  public static int firstUniqChar1(String s) {
    //记录字符出现频次
    HashMap<Character, Integer> hashMap = new HashMap<>();
    int length = s.length();
    //默认频次等于0
    int count = 0;
    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);
      if(hashMap.containsKey(c)){
        //出现次数加1
        Integer value = hashMap.get(c);
        hashMap.put(c,value+1);
      }else {
        hashMap.put(c,count+1);
      }
    }
    //判断出现频次等于一的第一个元素
    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);
      Integer value = hashMap.get(c);
      if(value == 1){
        return i;
      }
    }
    return -1;
  }
  ```

### 94. 二叉树的中序遍历 

- 描述: 给定一个二叉树的根节点 `root` ，返回 *它的 **中序** 遍历*

- 中序遍历概念: 先输出节点的左子树节点,再输出根节点,再输出节点的右子树节点

- 链接: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/

- 核心代码:

  ```java
  /**
   * Definition for a binary tree node.
   * public class TreeNode {
   *     int val;
   *     TreeNode left;
   *     TreeNode right;
   *     TreeNode() {}
   *     TreeNode(int val) { this.val = val; }
   *     TreeNode(int val, TreeNode left, TreeNode right) {
   *         this.val = val;
   *         this.left = left;
   *         this.right = right;
   *     }
   * }
   */
  class Solution {
      public List<Integer> inorderTraversal(TreeNode root) {
          List List = new ArrayList<TreeNode>();
          midOrder(root, List);
          return List;
      }
  
      //中序遍历
      public void midOrder(TreeNode root,List<Integer> list){
          if(null == root){
              return;
          }
          midOrder(root.left,list);
          list.add(root.val);
          midOrder(root.right,list);   
      }
  }
  ```

  

#### 

