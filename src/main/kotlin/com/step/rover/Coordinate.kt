package com.step.rover

class Coordinate(private var x: Int, private var y: Int) {
  fun forward(direction: Direction) {
    when (direction) {
      Direction.NORTH -> y += 1
      Direction.EAST -> x += 1
      Direction.SOUTH -> y -= 1
      else -> x -= 1
    }
  }

  override fun toString(): String {
    return "Coordinate(x=$x, y=$y)"
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Coordinate

    if (x != other.x) return false
    if (y != other.y) return false

    return true
  }

  override fun hashCode(): Int {
    var result = x
    result = 31 * result + y
    return result
  }

}
