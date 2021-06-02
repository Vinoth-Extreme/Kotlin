fun main(args: Array<String>) {
    val vowels = arrayOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val consonants = arrayOf<Char>('Z', 'B', 'T', 'G', 'H', 'z', 'b', 't', 'g', 'h')

    print("Enter a char: ")
    var x = readLine()

    vowelLoop@ for(l in vowels) {
        if(x.toString() == l.toString()) {
            println("$x is a vowel")
            break@vowelLoop
        }
    }

    consonantLoop@ for(l in consonants) {
        if(x.toString() == l.toString()) {
            println("$x is a consonant")
            break@consonantLoop
        }
    }
}