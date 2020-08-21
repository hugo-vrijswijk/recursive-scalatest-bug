import scala.meta._
import org.scalatest.funsuite.AnyFunSuite

class MainTest extends AnyFunSuite {
  test("example") {
    val first =
      q"""val a: String = "someString" + calculateOtherString(fromValue)"""
    val second =
      q"""val a: String = "someString" + calculateOtherString(fromValue)"""

    assert(first == second)

  }
}
