// To get Integer input from user

import java.util.Scanner

fun main(args: Array<String>) {
    val inp = Scanner(System.`in`)
    println("Enter an Integer")
    var x = inp.nextInt()
    print("User input is ${x}")
}