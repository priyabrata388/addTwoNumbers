package collectionWork

class mutableListPractice {
}

fun main(args: Array<String>) {
    var mutableList1 = mutableListOf("comp","lap","mob","tab")
    mutableList1.add("watch")
    println("all elements : $mutableList1")
    mutableList1.remove("lap")
    println("again all element : $mutableList1")
    mutableList1.add("book")
    println("all elements : $mutableList1")
}