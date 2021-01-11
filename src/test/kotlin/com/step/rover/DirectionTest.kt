package com.step.rover

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DirectionTest : FunSpec({
  test("Should rotate to right "){
    Direction.NORTH.rotateRight() shouldBe Direction.EAST
    Direction.WEST.rotateRight() shouldBe Direction.NORTH
  }
})
