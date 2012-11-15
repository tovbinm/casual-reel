package casual.reel.problems

/* Problem 4:
  A palindromic number reads the same both ways.
  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91x99.
  Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem4(digits: Int) {

  def solve: Int = {

    def reverse(n: Int, r: Int = 0): Int =
      n match {
        case 0 => r
        case _ => reverse(n / 10, 10 * r + (n % 10))
      }

    def isPalindromic(n : Int) = n == reverse(n)

    val min = math.pow(10, digits - 1).toInt
    val max = 10 * min - 1

    (for {
      i <- max to min by -1
      j <- max to i by -1
      if isPalindromic(i * j)
    }
    yield i * j).max

  }

}
