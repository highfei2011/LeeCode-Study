# origin title
Given a 32-bit signed integer, reverse digits of an integer.  

Example 1:  
    Input: 123  
    Output:  321  

Example 2:  
    Input: -123  
    Output: -321  
  
Example 3:  
    Input: 120  
    Output: 21  

Note:  
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.  
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.  

# 题意
给出一个无符号整形数字，然后将他们反转。 
  
# 参考一(强力解决)  
1 如果数值为0,直接输出结果  
2 如果数值小于0或者大于0，取绝对值；去掉末尾的0，转换数字为字符串，然后遍历字符串  
3 获取中间字符的索引 `half =strLength/2 `  
4 如果 `half`为奇数，则使用 `a[n-1]` 和 `a[n+1]` 交换，否则使用 `a[n]` 和 `a[n+1]`交换  
5 将数组转换为字符串，然后输出  
  
# 参考二(通过追加方式)  
1 判断是否为负数，如果是负数，使用一个临时变量保存负号，然后再toString();否则直接toString()  
2 去掉末尾的0，遍历字符串，取出每一个字符，使用StringBuffer追加  
3 转换String为Long值，如果是负数，则使用0减去该值  
  
# 参考三(调用scala内部函数)
1 使用split("")，拆分数组  
2 使用reverse()，反转Array  
3 使用mkString("")，拼接Array，转化为String  
4 使用toLong()，转化String为数值  
5 如果输入的是负数，最终结果需要使用0减去该值  


  
