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
      a <- Stream.range(3, ((num - 3) / 3) + 1)
      b <- Stream.range(a + 1, (num - a - 1) / 2)
      c = num - a - b
      if a * a + b * b == c * c
    } yield a * b * c).head

}
