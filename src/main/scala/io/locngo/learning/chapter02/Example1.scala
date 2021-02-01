package io.locngo.learning.chapter02

object Example1 {
  def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (ss(n) == key) return n
      if (n >= (ss.length - 1)) return -1
      loop(n + 1)
    }
    loop(0)
  }

  def isLessThan(a: Int, b: Int): Boolean = {
    if (a <= b) true
    else false
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if ((n+1) > (as.length - 1)) return true
      if (!ordered(as(n), as(n+1))) return false
      loop(n+1)
    }
    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val arr = Array("abc", "xyz", "123", "456")
    println(findFirst(arr, "123"))

    val arr2 = Array(123, 456, 789)
    val arr3 = Array(123, 789, 456)

    println(isSorted(arr2, isLessThan))
    println(isSorted(arr3, isLessThan))
  }
}
