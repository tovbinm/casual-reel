package casual.reel

trait Numerics {

  def fib (n: Int, m: Int): Stream[Int] = n #:: fib (m, n + m)

  def isPrime(n: Int) = Stream.range(2, math.sqrt(n).toInt + 1).forall(n % _ != 0)

  lazy val primes = 2 #:: Stream.from(3, 2).filter(isPrime)

  lazy val primesBelow = (end: Int) => 2 #:: Stream.range(3, end, 2).filter(isPrime)

}
