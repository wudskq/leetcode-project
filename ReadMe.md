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