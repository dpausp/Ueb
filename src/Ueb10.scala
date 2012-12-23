object Ueb10 extends App {
  val list = List(1, 2, 3)
  def printList(list: List[Int]): Unit = if (!list.isEmpty) {
    println(list.head)
    println(list.tail)
    printList(list.tail)
  }
  def foreach(list: List[Int], f: Int => Unit): Unit =
    if (!list.isEmpty) {
      f(list.head)
      foreach(list.tail, f)
    }
  printList(list)
  foreach(list, println)
  def printDoubled(x: Int) = println(x * 2)
  foreach(list, printDoubled)
  val doubledList = list.map(doubleNumber)
  def doubleNumber(x: Int) = x * 2
  def zahlenAddieren(x: Int, y: Int) = x + y
  println(zahlenAddieren(2, 5))
  println(list.reduce(zahlenAddieren))
  def m(xs: List[List[Int]], x: Int) = {
    println(x)
    println(xs)
    (x :: xs.head) :: xs
  }
  def contains(list: List[Int], elem: Int): Boolean = {
    if (list.isEmpty)
      false
    else if (list.head == elem)
      true
    else contains(list.tail, elem)
  }
  println(contains(list, 2))

  println(list.foldLeft(List(List.empty[Int]))(m))
}