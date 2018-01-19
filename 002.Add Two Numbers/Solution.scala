object Solution {
   def main(args:Array[String]):Unit={
       val a=Array(2,7,2)
       val b=Array(7,5,9)
       val result=new Array[Int](a.length)
       for(i<- 0 until a.length ){
         result(i)=a(i)+b(i)
       }
       updateElements(result)
       println(result.mkString) 
   }
  
   /**
     * 进行进制处理
     * 注意：应该从右向左处理元素
     */
   def updateElements(array:Array[Int]):Unit={
     val arrayLength=array.length
     for(i <- arrayLength-1  to  0 by -1 ){
        if(array(i)>=10 && i>0 ){
          array(i)=array(i) % 10
          array(i-1)=array(i-1)+1
        }
     }
   }
}
