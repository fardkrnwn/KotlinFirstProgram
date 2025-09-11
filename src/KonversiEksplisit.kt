fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversit implisit
    println("Konversi variabel valInt secara implisit = " + valSum)
    val valLong: Long = valInt.toLong() //konversi eksplisit
    println("Konversi Variabel valInt secara ekspilit = " + valLong)
}