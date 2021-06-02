fun main(args: Array<String>) {
    var x: Int = 1
    var y: Int = 2
    var t: Int

    t = x
    x = y
    y = t

    println("After swapping: x = $x and y = $y")
}