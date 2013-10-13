object Ueb12 extends App {
  case class Name(vorname: String, name: String)
  val name1 = Name("Hans", "Meier")

  val name_a = Name("Hubert", "Müller")
  val name_b = Name("Jochen", "Bäckers")
  val name_c = Name("Peter", "Lustig")
  val liste1 = List(name_a, name_b, name_c)

  liste1.collect {
    case Name(vorname, name) => println("Vorname: %s Name: %s".format(vorname, name))
  }
  
  val vornameGross = liste1.collect {
    case Name(vorname, name) => Name(vorname.toUpperCase(), name)
  }
  
  println(vornameGross)
  
  val nachNachnamenSortiert = vornameGross.sortBy(_.name)
  println(nachNachnamenSortiert)
  
  
  val nachVornamenSortiert = vornameGross.sortBy(_.name)
  println(nachVornamenSortiert)
}