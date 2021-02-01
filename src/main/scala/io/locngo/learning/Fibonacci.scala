package io.locngo.learning

object Fibonacci {
  def fibonacci(nth: Int): Int = {
    @annotation.tailrec
    def go(index: Int, previous: Int, next: Int): Int = {
      if (nth == 0) return 0
      if (nth == 1) return 1
      if (index == nth) return previous + next
      go(index + 1, next, previous + next)
    }
    go(2, 0, 1)
  }

  def main(args: Array[String]): Unit = {
    val msg = "The value of fibonacci number of position %d is %d"
    println(msg.format(3, fibonacci(3)))
  }
}
