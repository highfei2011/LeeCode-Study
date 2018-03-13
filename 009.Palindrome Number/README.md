# Origin title
Determine whether an integer is a palindrome. Do this without extra space.  
  
**Some hints:**  
Could negative integers be palindromes? (ie, -1)  
  
If you are thinking of converting the integer to string, note the restriction of using extra space.  
  
You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?  
  
There is a more generic way of solving this problem.  
  
# 题意

# 参考
解题思路[https://www.programcreek.com/2013/02/leetcode-palindrome-number-java/]  
确定整数是否是回文。这样做没有额外的空间。  
与数字相关的问题通常由/和％解决。不需要额外的空间。这个问题与Reverse Integer问题类似。  
注意：这里没有额外的空间意味着不需要将整数转换为字符串，因为字符串将是整数的副本并占用额外的空间。div，left和right所占用的空间可以忽略不计。 
···
1、判断是否为负数，如果是负数，则返回false
2、初始化有多少个0
3、左边和右边拆分判断
···
