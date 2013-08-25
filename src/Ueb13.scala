object Ueb13 extends App {
  println("Bitte Zahl eingeben:")
  try {
	  Bla.test()
  } catch {
    case e: NumberFormatException =>
      throw new MyException("das war keine gültige Zahl!")
  }
}

object Bla {
  def test() {
  println("Bitte Zahl eingeben:")
    val input = readInt
  }
}

// kommentar

class MyException(msg: String) extends Exception(msg)
