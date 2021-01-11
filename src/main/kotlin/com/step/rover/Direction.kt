package com.step.rover

enum class Direction {
  NORTH,EAST,SOUTH,WEST;

  fun rotateRight(): Direction {
    return when (this){
      NORTH -> EAST
      EAST -> SOUTH
      SOUTH -> WEST
      else -> NORTH
    }
  }

}
