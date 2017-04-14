package com.infotarget.codility.scala

object BinaryGap {
  def solution(number: Int): Int = {
    val lengthArray = number.toBinaryString.replaceAll("0+$", "").split("1+").map(_.length)
    if (lengthArray.isEmpty) 0 else lengthArray.max
  }
}
