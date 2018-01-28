import java.lang.Math

object Solution {
   def main(args:Array[String]):Unit={
      val str="abcbcade"
      val longestSubString=lengthOfLongestSubstring(str)
      println(s"The length of longest subString is $longestSubString .")
   }
  
   /**
     *  使用Set维护窗口
     */
   def lengthOfLongestSubstring(s:String):Int={
     var ans,i,j=0
     val strLength=s.length
     val set=scala.collection.mutable.SortedSet[Char]()
     while(i<strLength && j<strLength ){
       if (!set.contains(s.charAt(j))){
            set.add(s.charAt(j))
            j=j+1
            ans = Math.max(ans, j - i)
       }
       else {
            set.remove(s.charAt(i))
            i=i+1
       }  
     }
     ans  
   }
}
