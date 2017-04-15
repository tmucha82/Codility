package com.infotarget.codility.scala

import org.scalatest.FunSuite

class CyclicRotationTest extends FunSuite {

  test("testSolution") {
    val array = Array(3, 8, 9, 7, 6)
    assert(Array(6, 3, 8, 9, 7) === CyclicRotation.solution(array, 1))
    assert(Array(9, 7, 6, 3, 8) === CyclicRotation.solution(array, 3))
    assert(Array(3, 8, 9, 7, 6) === CyclicRotation.solution(array, 5))
  }

}
