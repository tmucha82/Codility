package com.infotarget.codility.scala

object AbsDistinct {
  def solution(array: Array[Int]): Int = array.map(Math.abs).toSet.size
}
