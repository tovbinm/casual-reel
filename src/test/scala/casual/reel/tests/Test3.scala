package casual.reel.tests

import casual.reel.problems.Problem3
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test3 extends FunSuite {

  test("largest prime factor of 13195") {
    val p = new Problem3(13195)
    assert(p.solve === 29)
  }

  test("largest prime factor of 123123") {
    val p = new Problem3(123123)
    assert(p.solve === 41)
  }

  test("largest prime factor of 600851475143") {
    val p = new Problem3(600851475143L)
    assert(p.solve === 6857)
  }

}
