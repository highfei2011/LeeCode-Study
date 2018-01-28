# Origin title content
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given _"abcabcbb"_ , the answer is _"abc"_ , which the length is 3.

Given _"bbbbb"_ , the answer is _"b"_ , with the length of 1 .

Given _"pwwkew"_ , the answer is _"wke"_ , with the length of 3. Note that the answer must be a substring, _"pwke"_ is a subsequence and not a substring.


# 题意
给定一个字符串,请找出其中无重复字符的最长子字符串.

## 样例
例如 ,在 _"abcabcbb"_ 中 ,其无重复字符的最长子字符串是 _"abc"_ ,其长度为 3 .

对于 , _"bbbbb"_ ,其无重复字符的最长子字符串为 _"b"_ ,长度为1 .

# 参考(Scala)

## 思路一
此题需要好好读懂题意:**没有重复字符**的最长子字符串的**长度**.那么可以考虑使用滑动窗口的解决方式.
1. 我们使用 `HashSet` 来存储当前窗口 `[i,j)` (初始化 j = i）中的字符.
2. 然后我们向右滑动索引 _j_. 如果它不在 `HashSet` 中,我们进一步滑动 _j_ . 这样做直到 `s[j]` 已经在 `HashSet` 中.
3. 此时,我们发现没有重复字符的子字符串的最大尺寸从索引 **i** 开始,如果我们为所有 **i** 这样做,我们将会得到答案.
4. 相当于移入和移出的过程.
