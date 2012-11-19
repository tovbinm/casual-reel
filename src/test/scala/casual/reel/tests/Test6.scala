package casual.reel.tests

import casual.reel.problems.Problem6
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test6 extends FunSuite {

  test("sum(1+...+n)^2 - sum(1^2+...+n^2) = 2640, where n in [1,10]") {
    val p = new Problem6(10)
    assert(p.solve === 2640)
  }

  test("sum(1+...+n)^2 - sum(1^2+...+n^2) = 25164150, where n in [1,100]") {
    val p = new Problem6(100)
    assert(p.solve === 25164150)
  }

}
