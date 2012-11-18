package casual.reel.problems

/*
  Problem 3:
  The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?
 */

class Problem3(n: Long) {

  def solve = {
    def solve0(n: Long): Long = {
      val div = Stream.from(2).filter{ n % _ == 0 }.head

      if (div == n) n
      else solve0(n / div)
    }
    solve0(n)
  }
}
