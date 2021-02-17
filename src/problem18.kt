fun main(args: Array<String>) {
    val numArray = doubleArrayOf (45.9, 67.4, -45.9, 20.33, 33.7, 45.0)
    var sum = 0.0
    for (num in numArray){
        sum+=num
    }
    val average = sum/numArray.size
    println("the average is : %.2f".format(average))
}