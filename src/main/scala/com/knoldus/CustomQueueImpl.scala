package com.knoldus

object CustomQueueImpl {

  def main(args: Array[String]): Unit = {
    // creating an Integer type Queue
    val queue1 = new CustomQueue[Int]

    val emptyQueue1 = List.empty[Int]

    val queue1WithEnq1 = queue1.enqueue(emptyQueue1, 5)
    val queue1WithEnq2 = queue1.enqueue(queue1WithEnq1, 18)
    println(queue1WithEnq2)

    val queue1WithDeq1 = queue1.dequeue(queue1WithEnq2)
    println(queue1.isEmpty(queue1WithDeq1))
    println(queue1WithDeq1)

    println()

    // creating a Character type Queue
    val queue2 = new CustomQueue[Char]

    val emptyQueue2 = List.empty[Char]

    val queue2WithEnq1 = queue2.enqueue(emptyQueue2, 'a')
    val queue2WithEnq2 = queue2.enqueue(queue2WithEnq1, 'b')
    println(queue2WithEnq2)

    val queue2WithDeq1 = queue2.dequeue(queue2WithEnq2)
    println(queue2.isEmpty(queue2WithDeq1))
    println(queue2WithDeq1)
  }
}
