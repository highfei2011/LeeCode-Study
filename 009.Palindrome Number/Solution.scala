object Solution{
  def main(args:Array[String]):Unit={

  }
  
  /**
    * Judgement the number is palindrome or not .
    */
  def isPalindrome(x:Int):Boolean={
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
