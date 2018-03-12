# Origin title
Implement _atoi_ to convert a string to an integer.  
  
`Hint`: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.  
  
`Notes`: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.  
   
  
`Requirements for atoi:`  
  
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.  
  
The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.  
  
If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.  
  
If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, `INT_MAX` (2147483647) or `INT_MIN` (-2147483648) is returned.  
  
# 题意

实现_atoi_这个函数，将一个字符串转换为整数。如果没有合法的整数，返回0。如果整数超出了32位整数的范围，返回`INT_MAX(2147483647)`如果是正整数，或者`INT_MIN(-2147483648)`如果是负整数。  
解释：__atoi__ 表示`ascii to integer` 

# 参考方法
根据题意，我们需要明白的几个要求：  
```
1. null or empty string
2. white spaces
3. +/- sign
4. calculate real value
5. handle min & max 
```  
然后，一步一步实现。  

