package collection

class IteratorExample {
}
fun main()
{
    val list= mutableListOf<Int>(1,2,3,4,5,6,77)
    val it=list.iterator()
    while (it.hasNext())
    {
        println(it.next())
    }
}