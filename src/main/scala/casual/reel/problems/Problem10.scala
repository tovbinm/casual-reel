package casual.reel.problems

import casual.reel.Numerics

/*
  Problem 10:
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.
 */
class Problem10(max: Int) extends Numerics {

  def solve =
    primesBelow(max).foldLeft(0L)((a,n) => a + n)

}
