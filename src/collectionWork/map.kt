package collectionWork

fun main(args: Array<String>) {
//    var map = hashMapOf<Int,String>()
//    map.put(5,"ab")
//    map.put(4,"bcbc")
//    map.put(7,"gfgf")
//    map.replace(4,"tyty")
//    println("element is : $map")
    val mapExample= mutableMapOf<String,String>("name" to "papun","age" to "21")
    println(mapExample.get("name"))
    println(mapExample.get("age"))
    mapExample.put("address","odisha")
    println(mapExample)
}