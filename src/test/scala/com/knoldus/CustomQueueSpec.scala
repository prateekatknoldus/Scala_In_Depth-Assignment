package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CustomQueueSpec extends AnyFlatSpec{
  val queue = new CustomQueue[String]

  "enqueue method" should "insert an element at the end of the queue and returns the updated queue" in {
    val queueAfterEnq = queue.enqueue(List("Apple"), "Orange")
    assert(queueAfterEnq == List("Apple", "Orange"))
  }

  behavior of "dequeue method"

  it should "throw a NoSuchElementException if the given queue is empty" in {
    val givenQueue = List.empty[String]
    assertThrows[NoSuchElementException]{
      queue.dequeue(givenQueue)
    }
  }

  it should "delete an element from the beginning of a non-empty queue and returns the updated queue" in {
    val queueAfterDeq = queue.dequeue(List("Apple", "Orange"))
    assert(queueAfterDeq == List("Orange"))
  }

  "isEmpty method" should "return false if the given queue has some elements" in{
    val givenQueue = List("Orange")
    assert(!queue.isEmpty(givenQueue))
  }

}
