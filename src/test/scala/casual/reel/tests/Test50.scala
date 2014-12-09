package casual.reel.tests

import casual.reel.problems.Problem50
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test50 extends FunSuite {

  test("100") {
    val p = new Problem50(100)
    assert(p.solve === 41)
  }

  test("1000") {
    val p = new Problem50(1000)
    assert(p.solve === 953)
  }

  test("10000") {
    val p = new Problem50(10000)
    assert(p.solve === 9521)
  }

  test("100000") {
    val p = new Problem50(100000)
    assert(p.solve === 92951)
  }

  test("1000000") {
    val p = new Problem50(1000000)
    assert(p.solve === 997651)
  }

  // test("10000000") {
  //   val p = new Problem50(10000000)
  //   assert(p.solve === 9951191)
  // }

}
