
object TranslatingNumbers{

  val english = List("", " thousand ", " million ", " billion ", " trillion ", " quadrillion ", "quintillion ", "sextillion ")
  val french = List("", " thousand ", " million ", " milliard ", " billion ", " billiard ", " trillion ", " trilliard ")

  @throws(classOf[IndexOutOfBoundsException])
  val split = (number: String, lang: List[String]) => {
    val grouped = number.replaceAll("[^0-9.]", "").reverse.grouped(3).toList
    val added = for (i <- 0 until grouped.length) yield {
      grouped(i).reverse.replaceFirst("^0*", "") + lang(i)
    }
    added.reverse.mkString
  }


}
