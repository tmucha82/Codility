package com.infotarget.codility.scala

import org.scalatest.FunSuite

class MissingIntegerTest extends FunSuite {

  test("testSolution") {
    assert(5 === MissingInteger.solution(Array[Int](1, 3, 6, 4, 1, 2)))
  }

}
