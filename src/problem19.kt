fun main(args: Array<String>) {
    val numArray =doubleArrayOf(23.6,65.6,89.5,36.7,43.7,78.9)
    var largest=numArray[0]
    for(num in numArray){
        if (largest<num)
            largest=num
    }
    println("largest element=%.2f".format(largest))

}