fun main(args: Array<String>) {
    val number=60
    print("factors of $number are :")
    for (i in 1..number){
        if (number%i==0) {
            print("$i  ")
        }
    }
}