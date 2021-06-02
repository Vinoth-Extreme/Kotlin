fun main(args: Array<String>) {
    var y = 2000
    var leap = false

    // Method 1
    if(y % 4 == 0) {
        if( y % 100 == 0 ) {
            leap = y % 400 == 0
        } else leap = true
    } else leap = false

    println(if(leap) "$y is leap " else "$y is a leap")


    // Method 2
    leap = when {
        y % 4 == 0 -> {
            when {
                y % 100 == 0 -> y % 400 == 0
                else -> false
            }
        }
        else -> false
    }
}