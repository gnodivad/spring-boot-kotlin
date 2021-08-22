fun main() {
    // immutable list
    val colors = listOf("Red", "Green", "Blue")
    println(colors::class.qualifiedName)

    // mutable list
    val days = mutableListOf("Monday", "Tuesday", "Wednesday")
    val numbers = mutableListOf<Int>()
}