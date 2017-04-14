package com.infotarget.codility.scala

import org.scalatest.FunSuite

class BinaryGapTest extends FunSuite {

  test("testSolution") {
    assert(2 === BinaryGap.solution(9))
    assert(4 === BinaryGap.solution(529))
    assert(5 === BinaryGap.solution(1041))
    assert(0 === BinaryGap.solution(15))
    assert(0 === BinaryGap.solution(8))
  }
}
