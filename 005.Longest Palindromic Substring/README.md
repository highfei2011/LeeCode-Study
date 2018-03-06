# Origin title content
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

**Example:**

- Input: "babad"

- Output: "bab"

Note: "aba" is also a valid answer.

---
**Example:**

- Input: "cbbd"

- Output: "bb"

# 题意
给出一个字符串(假设长度最长为1000),求出它的最长回文子串,你可以假定只有一个满足条件的最长回文串.
- **回文串**:一个正读和反读都一样的字符串,比如 _"level"_ 或者 _"noon"_ 等等就是回文串.

## 样例
给出字符串 _**"abcdzdcab"**_ ,它的最长回文子串为 _**"cdzdc"**_ .

# 参考(Scala)

## 思路一(耗时太多)

1. 需要有一个方法判断一个字符串是否为回文串.
2. 遍历所有可能出现的字符串,执行判断是否为回文的函数.
3. 打印符合条件的函数

## 思路二
refer to :  
https://www.felix021.com/blog/read.php?2040  
https://leetcode.com/problems/longest-palindromic-substring/description/  
https://leetcode.com/articles/longest-palindromic-substring/  
