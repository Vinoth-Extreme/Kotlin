fun main(args: Array<String>) {
    var myArr0 = Array<Int>(5){0} // Array of 5 zeros.
    var myArr1 = arrayOf(1, 2, 3, 4, 5)
    var myArr2 = arrayOf<Long>(11, 12, 13, 14, 15)

    // Normal
    println(myArr0)

    // Set methos
    myArr1.set(0, 5)
    println(myArr1)

    myArr2.set(2, 90)
    println(myArr2)

    for(el in myArr1) {
        println(el)
    }
    println()
    for(el in myArr2) {
        println(el)
    }

    // get method
    println(myArr1.get(3))

    var y = myArr2.get(0)
    y = 100
}