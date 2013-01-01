import scala.annotation.tailrec
import scala.util.Random

object Bierspiel extends App {

  val maxCapacity = 1000
  val rand = new Random
  val maxRunde = 4000

  @tailrec
  final def handleWareneingang(runde: Int, gerade: Double, ungerade: Double): (Double, Double) = {
    val menge = rand.nextInt(9)
    if (runde == maxRunde)
      (gerade, ungerade)

    else {
      val (neuGerade, neuUngerade) = if (gerade + ungerade >= maxCapacity)
        (gerade, ungerade)
      else if (runde % 2 == 0)
        (gerade + menge * 1.1, ungerade)
      else
        (gerade, ungerade + menge)

      handleWareneingang(runde + 1, neuGerade, neuUngerade)
    }
  }
  println(handleWareneingang(0, 0, 0))
  println("blabbb")
}
