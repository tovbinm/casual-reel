package casual.reel.tests

import casual.reel.problems.Problem10
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test10 extends FunSuite {

  test("sum all primes below 10") {
    val p = new Problem10(10)
    assert(p.solve === 17)
  }

  test("sum all primes below 2000000") {
    val p = new Problem10(2000000)
    assert(p.solve === 142913828922L)
  }

}
