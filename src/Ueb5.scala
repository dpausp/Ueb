object Ueb5 extends App {

  def fuenf = 5

  def id(x: Int) = x

  def mult(x: Int, y: Int) = x * y

  def poly(x: Int) = 3 * x * x + 5 * x + 2

  def poly2(x: Int) = {
    val teil1 = 3 * x * x
    val teil2 = 5 * x
    teil1 + teil2 + 2
  }

  def ergebnisFormatieren(vorname: String, zeit: Double) = "Vorname: %s -> Zeit: %f".format(vorname, zeit)

  val a = fuenf * 6
  println(a)
  val b = mult(3, 6)
  println(b)
  println(id(10))
  println(poly(4))
  println(poly(4))
  println(ergebnisFormatieren("Hans", 24))
  val c = mult(mult(5, 3), 4)
  println(c)
}