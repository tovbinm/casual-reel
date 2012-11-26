package casual.reel

trait Numerics {

  def fib (n: Int, m: Int): Stream[Int] = n #:: fib (m, n + m)

  def isPrime(n: Int) =
    BigInt(n).isProbablePrime(5) &&
    (2 to math.sqrt(n).toInt + 1).forall(n % _ != 0)

  lazy val primes = 2 #:: Stream.from(3, 2).filter(isPrime)

  /* Sieve of Eratosthenes */
  lazy val primesBelow = (num: Int) => {
    val bound = (num) / 2
    val numbers = Array.fill(bound + 1)(true)
    for {
      n <- 1 to math.sqrt(num).toInt / 2
      if numbers(n)
      m <- 2 * n * (n + 1) to bound by 2 * n + 1
    } numbers(m) = false

    2 :: (1 until bound).filter(numbers).map(2 * _ + 1).toList
  }

}
