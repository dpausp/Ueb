import scala.annotation.tailrec

object Ueb6 extends App {

  def summeBisN(n: Int): Int = if (n == 1) 1 else summeBisN(n - 1) + n

  @tailrec
  def summmeBisN2(n: Int, acc: Int = 0): Int = if (n == 1)
    acc + 1
  else
    summmeBisN2(n - 1, n + acc)

  def gauss(n: Int) = (n + 1) * n / 2

  var count = 0

  def fib(n: Int): Int = {
    if (n == 0) 0 else if (n == 1) 1 else fib(n - 2) + fib(n - 1)
  }

  def fib2(n: Int, i: Int = 2, n1: Int = 1, n2: Int = 1): Int = if (i == n)
    n2
  else
    fib2(n, i + 1, n2, n1 + n2)

  println(summeBisN(100))
  println(summmeBisN2(1080000))
  println(gauss(100))

  val li = 1 :: 2 :: 5 :: 7 :: Nil
  println(li)

  def listeVerdoppeln(liste: List[Int]): List[Int] = liste match {
    case Nil => Nil
    case x :: xs => x * 2 :: listeVerdoppeln(xs)
  }

  def map2(liste: List[Int], funktion: (Int) => Int): List[Int] = liste match {
    case Nil => Nil
    case x :: xs => funktion(x) :: map2(xs, funktion)
  }

  def verdoppeln(x: Int) = x * 2
  def verdreifachen(x: Int) = x * 3

  println("f10000 " + summeBisN(10000))
  println("fib:20 " + fib(20))
  println("fib2:20 " + fib2(20))
  println(count)
  println(listeVerdoppeln(li))
  println(map2(li, verdreifachen))
  println(li.map(verdreifachen))
}