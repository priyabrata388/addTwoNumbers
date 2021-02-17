package collectionWork

fun main()
{
    val list= mutableListOf(2)
    println("data.=${list}")
    for (i in 3..5) {
        list.add(i)
    }
    println("New Data i  List after insertion is. $list")

}