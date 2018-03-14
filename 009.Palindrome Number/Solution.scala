object Solution{
  def main(args:Array[String]):Unit={
   val x= 12344321
   println(s"Origin number is $x .")
   val res=isPalindrome(x)
   println(s"Origin number is $res .")
  }
  
  /**
    * Judgement the number is palindrome or not .
    */
  def isPalindrome(input:Int):Boolean={
             var x=input   
             //negative numbers are not palindrome
		if (x < 0){
		 return  false
                }else{
		// initialize how many zeros
		var div = 1
		while (x / div >= 10) {
			div *= 10
		}
 
		while (x != 0) {
		     val left = x / div
		     val right = x % 10
 
			if (left != right)
				return false
 
			x = (x % div) / 10;
			div /= 100;
		}
 
		return true
                }
  
  }

}
