object Solution{
   def main(args:Array[String]):Unit={
    val str="  -00172123333333333329999999999981j49"
    println(s"Origin string  is $str")
    val result=atoi(str)
    println(s"Result int is $result")
   }

   /**
     *  Implement th atoi calclution .
     */
   def atoi(str:String):Int={
        // is null or not
        if(str==null || str.length <1){
          return 0
         }       

       // trim white spaces
        val newStr = str.trim
        var flag = '+'

       // check negative or positive
        var i=0
        if (newStr.charAt(0) == '-') {
	   flag = '-'
	   i+=1
         } else if (newStr.charAt(0) == '+') {
	   i+=1
         } 
       // use double to restore the result
        var result=0.0

       // calculate the value
        while (newStr.length > i && newStr.charAt(i) >= '0' && newStr.charAt(i) <= '9') {
	    result = result * 10 + (newStr.charAt(i) - '0')
	    i+=1
	}
 
	if (flag == '-'){
	  result = -result
        }
       
        // handle max and min
        if (result > Integer.MAX_VALUE){
	   Integer.MAX_VALUE
        }
	else if (result < Integer.MIN_VALUE){
           Integer.MIN_VALUE
        }else{
           result.toInt
        }
   }
}
