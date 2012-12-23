import scala.math.pow

object Taschenrechner extends App {

  def hoch(a: Int, b: Int): Int = if (b == 0) 1 else if (b == 1) a else b * hoch(a, b - 1)

  def hochSchnell(a: Int, e: Int): Int = if (e == 0) 1
  else if (e % 2 == 0)
    hochSchnell(a, e / 2) * hochSchnell(a, e / 2)
  else
    hochSchnell(a, e - 1) * a

  def rechne(a: Int, b: Int, operator: String) = operator match {

    case "+" => a + b
    case "*" => a * b
    case "-" => a - b
    case "/" => a / b
    case "**" => pow(a, b)
  }

  def rechenschritt() {
    print("Zahl1:")
    val a = readInt
    print("Zahl2:")
    val b = readInt
    print("Operator:")
    val operator = readLine
    val ergebnis = rechne(a, b, operator)
    println(ergebnis)
  }

  println(hoch(2, 5))
  //  rechenschritt()
}