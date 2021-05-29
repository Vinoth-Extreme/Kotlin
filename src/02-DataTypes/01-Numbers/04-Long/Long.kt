fun main(args: Array<String>) {
    var x : Long = 10000000000
    var y : Long = 100L
    // 100 is by default, considered as Int.
    // To avoid that error, Append "L" with the value.
    println("$x - $y")
}