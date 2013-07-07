package casual.reel.tests

import casual.reel.problems.Problem12
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test12 extends FunSuite {

  test("28 is a 1st triangle number with 5 divisors") {
    val p = new Problem12(5)
    assert( p.solve == 28 )
  }
  
  test("76576500 is a 1st triangle number with 500 divisors") {
    val p = new Problem12(500)
    assert( p.solve == 76576500 )
  }

}
