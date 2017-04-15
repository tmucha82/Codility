package com.infotarget.codility.scala

import org.scalatest.FunSuite

class PermMissingElemTest extends FunSuite {

  test("testSolution") {
    assert(4 === PermMissingElem.solution(Array(2, 3, 1, 5)))
  }
}
