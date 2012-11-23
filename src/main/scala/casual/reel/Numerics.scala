package casual.reel

trait Numerics {

  def fib (n: Int, m: Int): Stream[Int] = n #:: fib (m, n + m)

  def isPrime(n: Int) =
    BigInt(n).isProbablePrime(5) &&
    (2 to math.sqrt(n).toInt + 1).forall(n % _ != 0)

  lazy val primes = 2 #:: Stream.from(3, 2).filter(isPrime)

  /* Sieve of Eratosthenes */
  lazy val primesBelow = (end: Int) => {
    val numbers = Array.fill(end + 1)(true)
    for {
      n <- 2 to math.sqrt(end).toInt + 1
      if numbers(n)
      m <- (n * n) to end by n
    } numbers(m) = false
    for {
      n <- 2 to end
      if numbers(n)
    } yield n
  }

}
