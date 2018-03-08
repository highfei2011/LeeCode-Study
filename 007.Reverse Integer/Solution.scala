import java.lang.Math

object Solution{
  def main(args:Array[String]):Unit={
   val x= -123342390
   println(s"Input int is $x")
   val result=reverse(x)
   println(s"Output int is $result")
  }
  
  def reverse(x:Int):Long={
   val temp=if(x<0) 0
   val a=if(x>=0) x else Math.abs(x)
   val reverseString=a.toString().split("").reverse
   val result=reverseString.mkString("").toLong
   if(temp==0) 0-result else result

  }
}
