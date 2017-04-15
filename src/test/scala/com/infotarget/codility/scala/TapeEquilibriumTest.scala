package com.infotarget.codility.scala

import org.scalatest.FunSuite

class TapeEquilibriumTest extends FunSuite {

  test("testSolution") {
    assert(1 === TapeEquilibrium.solution(Array[Int](3, 1, 2, 4, 3)))
    assert(1 === TapeEquilibrium.solution(Array[Int](-3, 1, 2, 4, 3)))
  }

}
