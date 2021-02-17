fun main(args: Array<String>) {
    val a=3
    val b=26
    val c=8
    if (a>=b && a>=c)
        println("$a is the largest number")
    else if (b>=a && b>=c)
        println("$b is the largest number")
    else
        println("$c is the largest number")
}