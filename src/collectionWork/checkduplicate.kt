package collectionWork

class checkduplicate {
}

fun main(args: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3, 4, 5, 3, 2, 5, 6, 8, 4)
    for (i in array.indices) {
        for (j in i + 1 until array.size) {
            if (array[i] == array[j]) {
                println("This number occurrence more than once =${array[i]}")
            }
        }
    }
}