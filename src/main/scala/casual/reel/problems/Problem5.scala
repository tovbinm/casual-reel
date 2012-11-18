package casual.reel.problems

/*
  Problem 5:
  2520 is the smallest number that can be divided by each
  of the numbers from 1 to 10 without any remainder.

  What is the smallest positive number that is evenly
  divisible by all of the numbers from 1 to 20?
 */
class Problem5(max: Int) {

  lazy val smax = math.sqrt(max)
  lazy val lmax = math.log(max)

  lazy val primes =
    (2 to max)
        .foldLeft(List[Int]()){
            (acc: List[Int], i: Int) => if (acc.exists(i % _ == 0)) acc else i :: acc
        }.reverse

  def solve =
    primes.foldLeft(1L){(n, p) =>
      if (p > smax) n * p
      else
        n * math.pow(p , math.floor( lmax / math.log(p) )).toLong
    }
}
