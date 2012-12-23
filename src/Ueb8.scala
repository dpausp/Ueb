object Ueb8 extends App {
  def nullBisHundert(i: Int = 1) {
    println(i)
    if (i != 100)
      nullBisHundert(i + 1)
  }
  //  nullBisHundert(99)
  //  nullBisHundert(55)
  //  nullBisHundert(76)

  def zahlenAusgeben(i: Int = 1, n: Int = 1) {
    println(i)
    if (i != n)
      zahlenAusgeben(i + 1, n)
  }
  //  zahlenAusgeben(20, 100)

  def zahlenAusgeben3(i: Int = 0, n: Int = 1, w: Int = 1) {
    println(i)
    if (i + w > n)
      zahlenAusgeben3(i + w, n, w)
  }

  def zahlenAusgeben2(i: Int = 0, n: Int = 1, w: Int = 1) {
    println(i)
    if (w > 0 && i + w < n || w < 0 && i + w > n)
      zahlenAusgeben2(i + w, n, w)
  }

  zahlenAusgeben3(66, 3, -4)
  println("\n\n")
  zahlenAusgeben2(66, 2, -4)

  3 to 66 by 4 foreach println
  66 to 4 by -4 foreach println
}
