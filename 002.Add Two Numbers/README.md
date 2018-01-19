# Origin title content
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

# 题意
假定用一个链表表示两个数,其中每个节点仅包含一个数字.
假设这两个数的数字顺序排列,请设计一种方法将两个数相加,并将其结果表现为链表的形式.

## 样例
给出 ``6->1->7 + 2->9->5``.即,``617 + 295``.

返回 ``9->1->2``.即,``912`` .

# 参考
## 思路一
`1` 创建两个数组 `a` 和 `b` , 对索引相同的元素进行求和,然后返回一个新的数组.
`2` 创建一个方法: 检查新数组的每个元素是否大于 ``10`` ,如果大于且该元素的索引不是0,则进位.
'3' 循环结束的条件: 元素值小于10 

## 思路二
`1` 在思路一的基础上进行合并步骤的处理:即,在做加法的过程中,进行进位.

# 本文实现了思路一

