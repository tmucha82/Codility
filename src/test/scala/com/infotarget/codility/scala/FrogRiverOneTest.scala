package com.infotarget.codility.scala

import org.scalatest.FunSuite

class FrogRiverOneTest extends FunSuite {

  test("testSolution") {
    assert(6 === FrogRiverOne.solution(5, Array[Int](1, 3, 1, 4, 2, 3, 5, 4)))
  }

}
