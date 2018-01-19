#Origin title content
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

#题意
给一个整数数组,找到两个数使得他们的和等于一个给定的数 target.

你需要实现的函数 `twoSum` 需要返回这两个数的下标, 并且第一个下标小于第二个下标.注意这里下标的范围是 0 到 n-1.

#样例
给出 numbers = [2, 7, 11, 15], target = 9, 返回 [0, 1].

#参考
##思路一
`1` 定义两个长度为 nums.length() 的整形数组: `a`和`b` ,复制 nums 的元素到 `a` 和 `b`中.
`2` 定义一个计算 `a` + `b`= `target`的方法,返回值为true时,递归收敛.
`3` 再定义两个全局整形变量: `m` 和 `n` ,外循环遍历 `a` ,内循环遍历 `b`, 在内循环中判断是否收敛.
`4` 当收敛时,将当前元素的索引分别赋值给 `m` 和 `n`.
`5` 结束循环

##思路二
`1` 对 `nums` 升序排序, 循环数组 `nums` ,求 `target` 与当前元素的差值,然后检索该差值的索引
`2` 收敛条件是: 如果索引大于等于0,那么停止循环
`3` 打印出下标和值

#本介绍中实现了思路二
