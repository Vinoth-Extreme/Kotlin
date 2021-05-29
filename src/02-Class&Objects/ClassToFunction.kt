fun main(args: Array<String>) {
    var Vinoth = FirstClass()
    Vinoth.name = "Updated name from function"
    println("Hello :, " + Vinoth.name)
    println("Hello :, ${Vinoth.name}")
}