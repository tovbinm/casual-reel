package casual.reel.tests

import casual.reel.problems.Problem4
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test4 extends FunSuite {

  test("largest palindrome for two 2-digit numbers") {
    val p = new Problem4(2)
    assert(p.solve === 9009)
  }

  test("largest palindrome for two 3-digit numbers") {
    val p = new Problem4(3)
    assert(p.solve === 906609)
  }

}
