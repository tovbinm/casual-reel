package casual.reel.tests

import casual.reel.problems.Problem9
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test9 extends FunSuite {

  test("A pythagorean triplet (a,b,c) which also preserves a + b + c = 1000") {
    val p = new Problem9(1000)
    assert(p.solve === 31875000)
  }

}
