fun main(args: Array<String>) {
    var str1: String = "Vinoth"
    var str2: String = """VinothTwo"""

    println("compareTo(): ${str1.compareTo(str2)}")

    println("get(): ${str1.get(2)}")

    println("plus() ${str1.plus(str2)}")

    println("subSequence(): ${str1.subSequence(2, 5)}")

    println("contains(): ${str2.contains("Two", ignoreCase = true)}")

    println("count(): ${str1.count()}")

    println("drop(): ${str1.drop(3)}")

    print("dropLast(): ${str2.dropLast(3)}")
}