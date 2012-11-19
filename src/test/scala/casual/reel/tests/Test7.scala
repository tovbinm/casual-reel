package casual.reel.tests

import casual.reel.problems.Problem7
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test7 extends FunSuite {

  test("6th prime number is 13") {
    val p = new Problem7(6)
    assert(p.solve === 13)
  }

  test("10001th prime number is 104743") {
    val p = new Problem7(10001)
    assert(p.solve === 104743)
  }

}
