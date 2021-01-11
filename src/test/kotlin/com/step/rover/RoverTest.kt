package com.step.rover

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class RoverTest : FunSpec({

  test("Should move rover to forward") {
    val rover = Rover(Coordinate(0, 0), Direction.NORTH)
    rover.moveForward()

    rover shouldBe Rover(Coordinate(0, 1), Direction.NORTH)
  }

  test("Should rover rotate to right direction") {
    val rover = Rover(Coordinate(0, 0), Direction.NORTH)
    rover.rotateRight()

    rover shouldBe Rover(Coordinate(0, 0), Direction.EAST)
  }

  test("Should rover rotate to left direction") {
    val rover = Rover(Coordinate(0, 0), Direction.NORTH)
    rover.rotateLeft()

    rover shouldBe Rover(Coordinate(0, 0), Direction.WEST)
  }
})
