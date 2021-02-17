fun main() {
    val set= mutableSetOf<Int>(1,2,3,4)
    set.remove(2)
    set.add(10)
    println("data.$set")
}