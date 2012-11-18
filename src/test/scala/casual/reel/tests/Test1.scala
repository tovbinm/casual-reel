package casual.reel.tests

import casual.reel.problems.Problem1
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test1 extends FunSuite {

  test("0 to 10") {
    val p = new Problem1(10)
    assert( p.solve == 23 )
  }

  test("0 to 1000") {
    val p = new Problem1(1000)
    assert( p.solve == 233168 )
  }

}
