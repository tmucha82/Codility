package com.infotarget.codility.scala

import org.scalatest.FunSuite

class OddOccurrencesInArrayTest extends FunSuite {

  test("solution1") {
    testSolution(OddOccurrencesInArray.solution1)
  }

  test("solution2") {
    testSolution(OddOccurrencesInArray.solution2)
  }

  private def testSolution(solution: (Array[Int], Int) => Int) = {
    assert(7 === solution(Array(9, 3, 9, 3, 9, 7, 9), 7))
    assert(0 === solution(Array(9, 3, 9, 3, 9, 0, 9), 7))
    assert(9 === solution(Array(9, 3, 9, 3, 9, 0, 9), 1))
  }
}
