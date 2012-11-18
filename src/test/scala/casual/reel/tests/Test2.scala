package casual.reel.tests

import casual.reel.problems.Problem2
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test2 extends FunSuite {

  test("10 terms") {
    val p = new Problem2(10)
    assert( p.solve == 10 )
  }

  test("4000000 terms") {
    val p = new Problem2(4000000)
    assert( p.solve == 4613732 )
  }

}
