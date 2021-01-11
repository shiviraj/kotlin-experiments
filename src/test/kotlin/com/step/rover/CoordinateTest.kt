package com.step.rover

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CoordinateTest : FunSpec({

  test("should move forward in North direction") {
    val coordinate = Coordinate(0, 0)
    coordinate.forward(Direction.NORTH)
    coordinate shouldBe Coordinate(0, 1)
  }

  test("should move forward in East direction") {
    val coordinate = Coordinate(0, 0)
    coordinate.forward(Direction.EAST)
    coordinate shouldBe Coordinate(1, 0)
  }

  test("should move forward in South direction") {
    val coordinate = Coordinate(0, 0)
    coordinate.forward(Direction.SOUTH)
    coordinate shouldBe Coordinate(0, -1)
  }

  test("should move forward in West direction") {
    val coordinate = Coordinate(0, 0)
    coordinate.forward(Direction.WEST)
    coordinate shouldBe Coordinate(-1, 0)
  }
})
