package casual.reel.problems

import casual.reel.Numerics

/*
  Problem 50:
  The prime 41, can be written as the sum of six consecutive primes:
	41 = 2 + 3 + 5 + 7 + 11 + 13
  This is the longest sum of consecutive primes that adds to a prime below one-hundred.
  The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms,
  and is equal to 953.
  Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */

class Problem50(max: Int) extends Numerics {

  def solve = {
	val ps = primes.takeWhile(_ <= max / 7)
	val pp = ps.takeWhile(p => ps.takeWhile(_ <= p).sum <= max)
	val sums =
	  for {
		i <- pp.size until 1 by -1
		p <- pp.sliding(i)
	  } yield p.sum
	sums.find(s => s <= max && isPrime(s)).getOrElse(0)
 }

}