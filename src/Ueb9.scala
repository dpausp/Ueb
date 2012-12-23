object Ueb9 extends App {

  def halberBaum(n: Int, i: Int = 0) {
    println("*" * i)
    if (i + 1 < n) {
      halberBaum(n, i + 1)
    }
  }

  def ganzerBaum(n: Int, i: Int = 0) {
    println(" " * (n - i) + "*" + "**" * i)
    if (i + 1 < n) {
      ganzerBaum(n, i + 1)
    }
  }

  halberBaum(15)
  ganzerBaum(10)

  def halberBaum2(s: String = "", n: String = "") {
    println(s)
    if (s != n)
      halberBaum2(s + "*", n)
  }

  //  halberBaum2(n = "******")

}