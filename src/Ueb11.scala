object Ueb11 extends App {
  val list1 = List(1, 2, 3, 3, 3)
  val set1 = Set(1, 2, 3, 3, 3)
  println(list1)
  println(set1)
  val list2 = List(1, 2, 3, 3, 3)
  val set2 = Set(list1, list2)
  println(set2)
  println(set2 intersect set2)

//  val input = readLine()
//  if (Set("ja", "yes", "JA") contains input) println("Benutzer stimmt zu")

  val map1 = Map("Hans" -> 24, "Ulf" -> 28, "Ute" -> 85)
  println(map1)
  println(map1("Hans"))
  println(map1.keys)
  println(map1.values)
  for ((k, v) <- map1) {
    println("%s: %s".format(k, v))
  }
  val newmap = map1.collect {
      case (k, v) => (k.toUpperCase(), v)
  }
  println(newmap)
  val mapToList = map1.toList
  val firstItem = mapToList.head
  println(firstItem._1)
  println(firstItem._2)
  val tup1 = ("Test", 6)
  val (wert1, wert2) = tup1
}