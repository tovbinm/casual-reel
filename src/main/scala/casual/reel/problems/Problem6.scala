package casual.reel.problems

/*
  Problem 6:
  The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385
  The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 55^2 = 3025
  Hence the difference between the sum of the squares of the
  first ten natural numbers and the square of the sum is
    3025 - 385 = 2640.

  Find the difference between the sum of the squares of the
  first one hundred natural numbers and the square of the sum.
*/
class Problem6(max: Int) {

  lazy val sumOfSquares = (max * (max + 1) * (2 * max + 1)) / 6

  lazy val sum = (max * (max + 1)) / 2

  lazy val squareOfSums =  sum * sum

  def solve = squareOfSums - sumOfSquares

}
