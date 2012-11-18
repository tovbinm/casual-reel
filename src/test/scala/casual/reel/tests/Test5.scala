package casual.reel.tests

import casual.reel.problems.Problem5
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test5 extends FunSuite {

  test("2520 can be divived by all the numbers in [2,10]") {
    val p = new Problem5(10)
    assert(p.solve === 2520)
  }

  test("232792560 can be divived by all the numbers in [2,20]") {
    val p = new Problem5(20)
    assert(p.solve === 232792560)
  }

  test("219060189739591200 can be divived by all the numbers in [2,42]") {
    val p = new Problem5(42)
    assert(p.solve === 219060189739591200L)
  }

}
