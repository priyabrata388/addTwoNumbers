package collectionWork

class convertArrayToSet {
}

fun main(args: Array<String>) {
    val array = arrayOf("a","b","c","d")
    val set= HashSet(array.asList())
    println("set : $set")
}