package com.infotarget.codility.scala

/**
  * Created by Tomek on 2017-04-14.
  */
class AbsDistinctTest extends org.scalatest.FunSuite {

  test("solution1") {
    assert(5 === AbsDistinct.solution(Array(-5, -3, -1, 0, 3, 6)))
    assert(4 === AbsDistinct.solution(Array(-5, -4, -4, -4, 0, 1, 1, 1, 4)))
    assert(1 === AbsDistinct.solution(Array(2, 2, 2, 2, 2)))
    assert(2 === AbsDistinct.solution(Array(-2147483648, 2147483647)))
    assert(1 === AbsDistinct.solution(Array(-2147483647, 2147483647)))
    assert(0 === AbsDistinct.solution(Array()))
  }
}
