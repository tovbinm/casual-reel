package casual.reel.problems

/*
  Problem 9:
  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    a^2 + b^2 = c^2

  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc.
*/
class Problem9(num: Int) {

  def solve =
    (for {
      c <- Stream.range(0, num)
      sC = c * c
      b <- Stream.range(0, c)
      sB = b * b
      a <- Stream.range(0, b)
      if a * a + sB == sC && a + b + c == num
    } yield a * b * c).head

}
