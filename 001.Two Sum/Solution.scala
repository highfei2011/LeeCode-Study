object Solution {
  def main(args:Array[String]):Unit={
   val nums=Array(34,2,7,11,15)
   scala.util.Sorting.quickSort(nums)
   val target=49
   for(i <- 0 until nums.length){
      val temp=nums.indexOf(target-nums(i))
      if(temp>=0){
        println(s"$i,$temp")  
        println(s"array($i)=${nums(i)} , array($temp)=${nums(temp)}")  
        return 
      }
   }
  }
}
