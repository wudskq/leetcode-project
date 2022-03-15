## LeetCode思路解析

### 项目结构说明:

- 该项目分为easy,secondary,difficulty(简单,中等,困难)
- 在每个包下分别会有leetcode相应的题解代码,Class名为leetcode的题号
- 解题对应的思路存放在ReadMe.md中,依据序号对应.eg: 类名为LeetCode19.java 则相关思路即为19开头的章节

### 19. 删除链表的倒数第 N 个结点

- 给你一个链表，删除链表的倒数第 `n` 个结点，并且返回链表的头结点。
- leetcode链接: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
- 核心思想:
  - 使用快慢指针即可解决,快指针永远先比慢指针走快n+1步,这个n即为题目中所指的倒数第几个
  - 即快指针与慢指针之间永远相隔n+1个距离
  - 然后快慢指针同时向后移动,当快指针等于null时,即代表已到链表最后,此时慢指针即为倒数第n-1个节点