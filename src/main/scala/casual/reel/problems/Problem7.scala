package casual.reel.problems


/*
  Problem 7:
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
  we can see that the 6th prime is 13.

  What is the 10 001st prime number?
  */

class Problem7(max: Int) {

  def isPrime(n: Int) = Stream.range(2, math.sqrt(n).toInt + 1).forall(n % _ != 0)

  lazy val primes = 2 #:: Stream.from(3, 2).filter(isPrime)

  def solve = primes.drop(max - 1).head

}
