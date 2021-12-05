package divideAndFibonacci

class Calculation extends Divide with Fibonacci{

  override def divideOf(firstno: Int, secondno: Int): Int={
    var result:Int = 0
    result = firstno/secondno
    result
  }

  override def fibonacciOf(num: Int):Int = {
    if(num <=1 ){
      num
    } else {
      fibonacciOf(num-1) + fibonacciOf(num-2)
    }
  }

}
