fun main(args: Array<String>) {
    var x = 10
    var y = 20
    var z = 15

    when {
        x >= y && x >= z -> println("$x is largest")
        y >= x && y >= z -> println("$y is largest")
        else -> println("$z is largest")
    }
}