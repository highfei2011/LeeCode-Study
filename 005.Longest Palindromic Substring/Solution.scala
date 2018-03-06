import java.lang.Math

object Solution {
   def main(args:Array[String]):Unit={
    val str="dfsabdcbdtbcmsdjafksdbsbbdmmd"
    println(s"Origin string is [$str] . ")
    val result=longestPalindrome(str)
    println(s"Longest palindrome is [$result] .")
   }

 def  longestPalindrome(s:String):String ={
    var  start = 0
    var  end = 0
    val sLength=s.length
    for (i <- 0 until sLength ) {
        val len1 = expandAroundCenter(s, i, i)
        val len2 = expandAroundCenter(s, i, i + 1)
        val len = Math.max(len1, len2)
        if (len > end - start) {
            start = i - (len - 1) / 2
            end = i + len / 2
        }
    }
    s.substring(start, end + 1)
  }

 def expandAroundCenter(s:String, left:Int, right:Int):Int= {
    var L = left
    var R = right
    while (L >= 0 && R < s.length && s.charAt(L) == s.charAt(R)) {
        L=L-1
        R=R+1
    }
    R - L - 1
 }
}
