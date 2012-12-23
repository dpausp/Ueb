object Ueb4 extends App {
  println("Gebe ja/yes oder nein ein.")
  val eingabe = readLine
  eingabe match {
    case "ja" | "yes" =>
      println("ja")
      println("eingegeben")
    case "nein" | "no" =>
      println("nein eingegeben")
    case _ => println("es wurde etwas Falsches eingegeben!")
  }
  val eingabe1 = readLine
  if (eingabe1 == "ja" | eingabe1 == "yes")
    (println("es wurde ja eingegeben"))
  else if (eingabe1 == "nein" | eingabe1 == "no")
    println("es wurde nein eingegeben")

  else println("es wurde etwas falsches eingegeben")
  print("hier wurde was geändert")
}
