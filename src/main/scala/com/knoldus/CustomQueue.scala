package com.knoldus

//Implementation of generic class CustomQueue
class CustomQueue[A]{
  // method to insert an element at the end of the given queue
  def enqueue(givenQueue: List[A], element: A): List[A] = {
    givenQueue ::: List(element)
  }

  // method to delete an element from the beginning of the given queue
  def dequeue(givenQueue: List[A]): List[A] = {
    if(givenQueue.isEmpty) {
      throw new NoSuchElementException("Queue is empty")
    }
    givenQueue.tail
  }

  // method to check whether the given queue is empty or not
  def isEmpty(givenQueue: List[A]): Boolean ={
    if(givenQueue.isEmpty) true
    else false
  }
}


