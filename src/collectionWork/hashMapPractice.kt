package collectionWork

class hashMapPractice {
}

fun main(args: Array<String>) {
    val map= HashMap<Int,String>()
    map.put(1,"a")
    map.put(2,"b")
    map.put(3,"c")
    map.put(4,"d")
    map.put(5,"e")
    val KeyList=ArrayList(map.keys)
    val ValueList=ArrayList(map.values)
    println("key list=$KeyList")
    println("value list =$ValueList")
}