import divideAndFibonacci.Calculation
import org.scalatest.funsuite.AnyFunSuite
class CalculationTest extends AnyFunSuite {
  var Calculation_object = new Calculation()

  // Division Test
  test("Test to check the division of zero (0)..") {
    val firstno = 0
    val secondno= 7
    val result = 0
    assert(Calculation_object.divideOf(firstno,secondno)==result)
  }

  test("Test to check the division by zero (0).. "){
    assertThrows[ArithmeticException](Calculation_object.divideOf(346,0))
  }

  test("Test to check the division by number.."){
    val firstno = 12
    val secondno = 3
    val result = 4
    assert(Calculation_object.divideOf(firstno,secondno)==result)
  }

  // Fibonacci Test
  test("Test to check the fibonacci of zero (0)..") {
    val num = 0
    val result = 0
    assert(Calculation_object.fibonacciOf(num)==result)
  }
  test("Test to check the fibonacci "){
    val num = 12
    val result =144
    assert(Calculation_object.fibonacciOf(num)==result)
  }


}
