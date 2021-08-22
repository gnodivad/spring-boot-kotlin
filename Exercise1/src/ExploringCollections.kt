fun main() {
    // immutable list
    val colors = listOf("Red", "Green", "Blue")
    println(colors::class.qualifiedName)

    // mutable list
    val days = mutableListOf("Monday", "Tuesday", "Wednesday")
    val numbers = mutableListOf<Int>()

    // sets
    val months = mutableSetOf("Jan", "Feb")

    // maps
    val webColors = mapOf("red" to "ff0000", "blue" to "00ff00")

    // arrays
    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.set(3, -4)
    intArray[4] = 9
    intArray.forEach { print("$it ") }

    println()
    println(colors[2])
}