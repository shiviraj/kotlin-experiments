package com.step.rover

class Rover(private val coordinate: Coordinate, private var direction: Direction) {
  fun moveForward() {
    coordinate.forward(direction)
  }

  fun rotateRight() {
    direction = direction.rotateRight()
  }

  fun rotateLeft() {
    direction = direction.rotateRight().rotateRight().rotateRight()
  }

  override fun toString(): String {
    return "Rover(coordinate=$coordinate, direction=$direction)"
  }

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Rover

    if (coordinate != other.coordinate) return false
    if (direction != other.direction) return false

    return true
  }

  override fun hashCode(): Int {
    var result = coordinate.hashCode()
    result = 31 * result + direction.hashCode()
    return result
  }

}