package com.step.rover

fun main(args: Array<String>) {
  val rover = Rover(Coordinate(0, 0), Direction.NORTH);
  println(rover);
  rover.moveForward();
  rover.rotateRight();
  println(rover);
  rover.moveForward();
  rover.rotateLeft();
  println(rover);
}