fun main(args: Array<String>) {
    val num = 50
    var factorial: Long = 1
    for (i in 1..num) {
        factorial *= i.toLong()
    }
    println("Factorial of $num = $factorial")
}