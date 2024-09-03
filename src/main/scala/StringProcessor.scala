object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    // вместо цикла for использовали функции работы с коллекциями filter и map
    // первая функция filter вместо условия if отобрала строки, длина которых больше 3
    // map к оставшимся строкам применил приведение к верхнему регистру
    strings.filter(x => x.length > 3).map(x => x.toUpperCase)
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}
