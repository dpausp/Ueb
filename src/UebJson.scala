import com.google.gson.Gson

object UebJson extends App {
	val gs = new Gson
	val json1 = gs.toJson(Array("Bla", "blubb"))
	println(json1)
	val array1 = gs.fromJson("[\"bla\", \"spam\"]", classOf[Array[String]])
	println(array1.toList)
	
	val deutsch_englisch = Map("Haus" -> "House", "Baum" -> "Tree") 
	
	
	val input = readInt
}