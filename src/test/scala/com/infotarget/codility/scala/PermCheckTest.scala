package com.infotarget.codility.scala

import org.scalatest.FunSuite

class PermCheckTest extends FunSuite {

  test("testSolution") {
    assert(1 === PermCheck.solution(Array(4, 1, 3, 2)))
    assert(0 === PermCheck.solution(Array(4, 1, 3)))
  }
}
