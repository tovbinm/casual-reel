package casual.reel.problems

import casual.reel.Numerics

class Problem12(divs: Int) extends Numerics {
  
  def solve = {
    def loop(i:Int): Int = {
      val n = i * (i + 1) / 2
      if (divisors(n) >= divs) return n
      else loop(i+1)
    }
    loop(1)
  }

}