fun main(args: Array<String>) {
    var a = 20
    var b = 4
    var rem = a % b

    while (rem != 0) {
        println("Sisa bagi = $rem")
        a = b
        b = rem
        rem = a % b
    }
    println("Sisa akhirnya = $rem")
}